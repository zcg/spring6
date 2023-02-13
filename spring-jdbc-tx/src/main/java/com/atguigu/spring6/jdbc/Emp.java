package com.atguigu.spring6.jdbc;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.jdbc
 * @className: Emp
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 18:49
 */
public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
