/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Ishti
 */
public class Faculty extends Person{
    float salary;
    String DesigNation;

    public Faculty(String name1, String dateOdBirth1) {
        super(name1, dateOdBirth1);
    }

    public Faculty(float salary, String DesigNation, String name1, String dateOdBirth1) {
        super(name1, dateOdBirth1);
        this.salary = salary;
        this.DesigNation = DesigNation;
    }

    public Faculty(float salary, String DesigNation) {
        this.salary = salary;
        this.DesigNation = DesigNation;
    }
    
    public Faculty() {
    }

    @Override
    public String toString() {
        return "Faculty{" +"Name= "+name+ "dateofbirth= "+dateOdBirth+ "salary=" + salary + ", DesigNation=" + DesigNation + '}';
    }

    
    
    
}
