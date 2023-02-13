package github.com.zcg.spring6_ioc_xml.ditest;

import java.util.List;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.ditest
 * @className: Dept
 * @author: zcg
 * @description: 员工类
 * @date: 2023/2/8 10:34
 */
public class Dept {
    private List<Emp> empList;

    private String dname;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info() {
        System.out.println("部门名称: " + dname);
        for (Emp emp : empList) {
            System.out.println("职员名称: "+emp.getEname());
        }
    }
}
