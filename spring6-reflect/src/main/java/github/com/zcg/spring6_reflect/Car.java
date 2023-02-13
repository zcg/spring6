package github.com.zcg.spring6_reflect;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_reflect
 * @className: Car
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/9 11:45
 */
public class Car {
    private String name;
    private int age;
    private String color;

    //私有方法
    private void run(){
        System.out.println("私有方法....run");
    }

    public Car() {
    }

    private Car(String name) {
        this.name = name;
    }

    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
