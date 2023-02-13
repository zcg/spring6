package github.com.zcg.spring6_ioc_xml.dimap;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.dimap
 * @className: Teacher
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 12:27
 */
public class Teacher {
    private Integer teacherId;
    private String teacherName;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
