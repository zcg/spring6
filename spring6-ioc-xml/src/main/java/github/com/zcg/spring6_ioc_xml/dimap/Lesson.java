package github.com.zcg.spring6_ioc_xml.dimap;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.dimap
 * @className: Lesson
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 12:59
 */
public class Lesson {
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
