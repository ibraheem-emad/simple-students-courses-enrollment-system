package student.course.enrollment;


public class Student
{
    private String name;
    private String id;
    private int grade;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    
    @Override
    public String toString() {
        return "{" + "name=" + name + ", id=" + id + ", grade=" + grade + '}';
    }
}
