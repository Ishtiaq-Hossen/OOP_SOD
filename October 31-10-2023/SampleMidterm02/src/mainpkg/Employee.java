/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author Ishti
 */
public class Employee {
    private int id;
    private String name,gender,dept,desig;
    private float salary;
    private LocalDate dob,doj;

    public Employee(int id, String name, String gender, String dept, String desig, float salary, LocalDate dob, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.desig = desig;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;
    }

    public int getId() {
        return id;
    }
    
    public String getDept() {
        return dept;
    }

    public float getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig=" + desig + ", salary=" + salary + ", dob=" + dob + ", doj=" + doj + '}'+"\n";
    }
    
    
}
