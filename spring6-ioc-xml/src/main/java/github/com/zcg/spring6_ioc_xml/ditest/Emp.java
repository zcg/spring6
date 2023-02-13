package github.com.zcg.spring6_ioc_xml.ditest;

import java.util.Arrays;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.ditest
 * @className: Emp
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 10:34
 */
public class Emp {
    private Dept dept;
    private String ename;
    private String age;
    private String[] loves;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work() {
        System.out.println(ename + " emp work... " + age+ Arrays.toString(loves));
        dept.info();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                ", ename='" + ename + '\'' +
                ", age='" + age + '\'' +
                ", loves=" + Arrays.toString(loves) +
                '}';
    }
}
