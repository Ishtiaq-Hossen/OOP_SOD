/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Ishti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s0=new Student("name1",101,3.05f);
        Student s1=new Student("name2",102,3.04f);
        Student s2=new Student("name3",102,3.03f);
        System.out.println(s0.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        Student.uniName="Abed University";
        System.out.println(s0.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
    }
    
}
