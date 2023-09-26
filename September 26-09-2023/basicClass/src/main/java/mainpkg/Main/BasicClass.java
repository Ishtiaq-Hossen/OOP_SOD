/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mainpkg.Main;

/**
 *
 * @author Ishti
 */
class Employee{
    String name,jobtitle;
    float salary;
    
    Employee(String n,String j,float s){
        name=n;
        jobtitle=j;
        salary=s;
    }
    Employee()
    {
        
    }
    void showEmployeeData()
    {
        System.out.println(name+" Jobtitle is: "+jobtitle+" & salary is: "+salary);
    }  
    void updateSalary(float a){
        salary=salary+a;
    }
    
}


public class BasicClass {

    public static void main(String[] args) {
        //Employee a=new Employee();//method //constructor 
        
        Employee a =new Employee("name1","assistant",15000f);
        a.showEmployeeData();
        a.updateSalary(5000f);
        a.showEmployeeData();
        
        //java data type => 1) primitive //int ,float,boolean,double
        //                  2) Non primitive //class,interface,arrays
        
        
        // class
        //1) pre-defined 
        //2) user-defined 
                
    }
}
