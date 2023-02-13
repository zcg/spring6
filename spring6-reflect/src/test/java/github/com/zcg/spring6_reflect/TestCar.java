package github.com.zcg.spring6_reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_reflect
 * @className: TestCar
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/9 16:15
 */
public class TestCar {
    // 1 获取class对象的多种方式
    @Test
    public void Test01() throws Exception {
        // 1 类名.class
        Class clzz1 = Car.class;
        // 2对象.getclass
        Class clzz2 = new Car().getClass();
        // Class.forName("全路径")
        Class clzz3 = Class.forName("github.com.zcg.spring6_reflect.Car");
        // 实例化
        Car car = (Car) clzz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    // 2 获取构造方法
    @Test
    public void test02() throws Exception {
        Class clzz = Car.class;
        Constructor[] declaredConstructors = clzz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("方法名称: " + declaredConstructor.getName() + " 参数个数: " + declaredConstructor.getParameterCount());
        }
        // 指定有参数构造
        // 1 构造public
        Constructor c1 = clzz.getDeclaredConstructor(String.class, int.class, String.class);
        Car car = (Car) c1.newInstance("夏利", 10, "红色");
        System.out.println(car);

        // 2 构造private
        Constructor c2 = clzz.getDeclaredConstructor(String.class, int.class);
        c2.setAccessible(true);
        Car car1 = (Car) c2.newInstance("大众", 30);
        System.out.println(car1);
    }


    // 3 获取属性
    @Test
    public void Test03() throws Exception {
        Class clzz = Car.class;

        Car car = (Car) clzz.getDeclaredConstructor().newInstance();

        // 获取公有属性
        // Field[] fields = clzz.getFields();

        // 获取所有属性(包括私有属性)
        Field[] declaredFields = clzz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("name")) {
                declaredField.setAccessible(true);
                declaredField.set(car, "五菱宏光");
                System.out.println(car);
            }
            System.out.println(declaredField.getName());
        }
    }

    // 4 获取方法
    @Test
    public void test04() throws InvocationTargetException, IllegalAccessException {
        Car car = new Car("奔驰", 10, "黑色");
        Class clzz = car.getClass();

        // 1 public方法

        Method[] methods = clzz.getMethods();
        for (Method method : methods) {
            // System.out.println(method.getName());
            // 执行方法
            if (method.getName().equals("toString")) {
                String invoke = (String) method.invoke(car);
                System.out.println("toString方法执行了  " + invoke);

            }
        }
        System.out.println("============");
        // 2 private方法
        Method[] declaredMethods = clzz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.setAccessible(true);
            if (declaredMethod.getName().equals("run")) {
                declaredMethod.invoke(car);
            }
        }

    }

}
