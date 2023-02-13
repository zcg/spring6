package github.com.zcg.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resource
 * @className: ClassPathReourceDemo
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 10:05
 */
// 访问类路径以下资源
public class ClassPathReourceDemo {

    public static void main(String[] args) {
        loadClassPathResource("atguigu.txt");
    }

    public static void loadClassPathResource(String path) {
        // 创建ClassPathReource对象
        ClassPathResource classPathResource = new ClassPathResource(path);
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());


        try {
            // 获取文件的内容
            InputStream inputStream = classPathResource.getInputStream();
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes)!=-1){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
