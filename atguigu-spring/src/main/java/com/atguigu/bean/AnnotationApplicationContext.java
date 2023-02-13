package com.atguigu.bean;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: spring6
 * @package: com.atguigu.bean
 * @className: AnnotationApplicationContext
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/10 13:28
 */
public class AnnotationApplicationContext implements ApplicationContext {
    // 创建一个map集合放bean对象

    private Map<Class, Object> beanFactory = new HashMap<>();

    private static String rootPath;


    // 返回创建的bean对象
    @Override
    public Object getBean(Class clzz) {
        return beanFactory.get(clzz);
    }

    // 设置包扫描规则
    // 当前包及其子包,哪个类有@Bean注解,就把这个类通过反射实例化

    public AnnotationApplicationContext(String basePackage) {
        // 把.换成\
        String packagePath = basePackage.replaceAll("\\.", "\\\\");
        // 获取包绝对路径
        try {
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getPath(), StandardCharsets.UTF_8);

                // 字符串截取
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());

                // 包扫描
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 依赖注入
        loadDi();

    }

    // 属性注入
    private void loadDi() {
        for (Map.Entry<Class, Object> entry : beanFactory.entrySet()) {
            // 获取容器里的对象
            Object object = entry.getValue();
            Class clzz = object.getClass();
            Field[] declaredFields = clzz.getDeclaredFields();
            for (Field field : declaredFields) {
                Di annotation = field.getAnnotation(Di.class);
                if (annotation != null) {
                    field.setAccessible(true);
                    try {
                        System.out.println("正在给【"+object.getClass().getName()+"】属性【" + field.getName() + "】注入值【"+
                                beanFactory.get(field.getType()).getClass().getName() +"】");
                        field.set(object, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    // 包扫描过程 实例化
    private void loadBean(File file) throws Exception {
        // 1 判断当前是否为文件夹
        if (file.isDirectory()) {
            // 2 获取文件夹中所有的内容
            File[] childFiles = file.listFiles();

            // 3 判断文件夹内容是否为空
            if (childFiles == null || childFiles.length == 0) {
                return;
            }
            // 4 遍历数组
            for (File childFile : childFiles) {
                // 4.1 看是否为文件夹若是这递归
                if (childFile.isDirectory()) {
                    // 4.2 这递归
                    loadBean(childFile);
                } else {
                    // 4.3 是文件 截取获得包路径和类名称部分
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length() - 1);

                    // 4.4 判断当前文件类型是否包含.class
                    if (pathWithClass.contains(".class")) {
                        // 4.5 把\替换成. 把.class去掉 转换成全类名
                        String allName = pathWithClass.replaceAll("\\\\", ".").replaceAll(".class", "");

                        // 反射获取判断是否有@Bean注解 有就实例化加入map容器
                        Class clzz = Class.forName(allName);
                        // 判断不是接口
                        if (!clzz.isInterface()) {
                            Bean annotation = (Bean) clzz.getAnnotation(Bean.class);
                            if (annotation != null) {
                                Object instance = clzz.getDeclaredConstructor().newInstance();
                                // 把对象实例化后防到map集合beanFactory
                                // 若果有接口就用接口class作为key
                                if (clzz.getInterfaces().length > 0) {
                                    beanFactory.put(clzz.getInterfaces()[0], instance);
                                } else {
                                    beanFactory.put(clzz, instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    // public static void main(String[] args) {
    //     // ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
    //     // context.getBean();
    //     new AnnotationApplicationContext("com.atguigu");
    // }
}
