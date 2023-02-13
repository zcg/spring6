package github.com.zcg.spring6_ioc_xml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.dimap
 * @className: Student
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 12:26
 */
public class Student {
    private List<Lesson> lessonList;

    private Map<String, Teacher> teacherMap;
    private Integer sid;
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public void run() {
        System.out.println("学生编号: " + sid + " 学生姓名: " + sname);
        System.out.println("老师:" + teacherMap);
        System.out.println("课程:" + lessonList);
    }
}
