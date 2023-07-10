/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Ishti
 */
public class Employee {
    //private public pakage protected
    
    
    private int id;
    private String name,desigNation,gender;
    private float salary;
    //public static String companyName="BracIT";

    public Employee(int id, String name, String desigNation, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.desigNation = desigNation;
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

    public String getDesigNation() {
        return desigNation;
    }

    public void setDesigNation(String desigNation) {
        this.desigNation = desigNation;
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
        return "Employee{" + "id=" + id + ", name=" + name + ", desigNation=" + desigNation + ", gender=" + gender + ", salary=" + salary + "}\n";
    }
    
    
    
}
