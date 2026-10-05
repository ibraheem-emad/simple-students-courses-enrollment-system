package student.course.enrollment;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentCourseEnrollment {

   
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ibrahim" , "ABC1" , 10));
        students.add(new Student("Ali" , "ABC2" , 8));
        students.add(new Student("Omar" , "ABC3" , 9));
        students.add(new Student("Mayar" , "ABC4" , 6));
        students.add(new Student("Khalid" , "ABC5" , 7));
        
        
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course("AI" , "C1"));
        courses.add(new Course("Data Bases" , "C2"));
        courses.add(new Course("Cyber Security" , "C3"));
        courses.add(new Course("Mobile development" , "C4"));
        courses.add(new Course("Web development" , "C5"));
        
        ArrayList<StudentCourse> studentCourses = new ArrayList<StudentCourse>();

        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            int choice = 0;
            Student chosenStudent;
            Course chosenCourse;
            boolean isRepeated = false;
            
            
            System.out.println("enter the number next to a student to enroll in a course(enter 0 to exit): ");
            for(int i = 0; i < students.size(); i++)
                System.out.println("(" + (i+1) + ")" + " name: " + students.get(i).getName() + " , ID: " + students.get(i).getId());
            
            choice = scan.nextInt();
            
            if(choice == 0) break;
            
            try
            {
                chosenStudent = students.get(choice - 1);
            }
            catch(Exception e)
            {
                System.out.println("invalid input!");
                continue;
            }
            
            System.out.println("enter the number of the course to enroll the student in: ");
            for(int i = 0; i < courses.size(); i++)
                System.out.println("(" + (i+1) + ")" + " name: " + courses.get(i).getTitle() + " , course's code: " + courses.get(i).getCode());
            choice = scan.nextInt();
            try
            {
                chosenCourse = courses.get(choice - 1);
            }
            catch(Exception e)
            {
                System.out.println("invalid input!");
                continue;
            }
            
            for(StudentCourse sc : studentCourses) if(chosenStudent.getId().equals(sc.getStudentId()) && chosenCourse.getCode().equals(sc.getCourseId())){
                System.out.println("the student is already enrolled in this course!");
                isRepeated = true;
            }
            
            if(isRepeated) continue;
            
            studentCourses.add(new StudentCourse(chosenStudent.getId() , chosenCourse.getCode()));
            System.out.println("the student " + chosenStudent.getName()+" ("+chosenStudent.getId()+") has been enrolled in the course " + chosenCourse.getTitle() + " (" + chosenCourse.getCode()+")");
            
        }

    }
    
}
