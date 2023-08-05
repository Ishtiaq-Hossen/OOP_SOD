/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Ishti
 */
public class Student {
    String name;
    int id;
    float cgpa;
    static String uniName="BRAC";
    //final String uniName2="BRAC2";

    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", cgpa=" + cgpa + "Uniname: "+uniName+"}";
    }

    
    
    
}
