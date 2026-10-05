//student object class
package student.course.enrollment;


public class Student extends Person
{
    private String id;
    private int grade;

    public String getName() {
        return super.name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }


    public void setName(String name) {
        super.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, String id, int grade) {
        super.name = name;
        this.id = id;
        this.grade = grade;
    }

    
    @Override
    public String toString() {
        return "{" + "name=" + super.name + ", id=" + id + ", grade=" + grade + '}';
    }
}
