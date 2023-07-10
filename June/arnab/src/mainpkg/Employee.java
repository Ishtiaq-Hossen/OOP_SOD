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
    private String name,designation,gender;
    private float salary;
    
    public Employee(int id, String name, String designation, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
    }
    public Employee()
    {
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", designation=" + designation + ", gender=" + gender + ", salary=" + salary + "}\n";
    }
    
    
    
    
}
