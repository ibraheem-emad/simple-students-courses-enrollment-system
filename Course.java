package student.course.enrollment;


public class Course {
    
    private String title;
    private String code;

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
    }

    @Override
    public String toString() {
        return "{" + "title=" + title + ", code=" + code + '}';
    }
    
    
    
}
