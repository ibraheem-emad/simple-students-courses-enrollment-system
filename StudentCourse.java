//link object between student and course

package student.course.enrollment;


public class StudentCourse
{
    String studentId;
    String courseId;

    public StudentCourse(String studentId, String courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "{" + "studentId=" + studentId + ", courseId=" + courseId + '}';
    }
    
    
}
