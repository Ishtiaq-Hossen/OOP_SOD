/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Ishti
 */
public class Student extends Person{
    
    String courseName;
    float courseGrade;

    public Student(String name1, String dateOdBirth1) {
        super(name1, dateOdBirth1);
    }

    public Student(String courseName, float courseGrade, String name1, String dateOdBirth1) {
        super(name1, dateOdBirth1);
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }

    public Student(String courseName, float courseGrade) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }
    

    public Student() {
        
    }

    @Override
    public String toString() {
        return "Student{ courseName=" + courseName + ", courseGrade= " + courseGrade + "person Name= "+ name+ "dob= "+dateOdBirth+"};";
    }

    
    
    
    
    
    
}
