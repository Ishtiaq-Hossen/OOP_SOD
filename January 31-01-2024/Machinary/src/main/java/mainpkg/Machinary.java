/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mainpkg;

/**
 *
 * @author Ishti
 */


//oop basic principle 

//Encapsulation //Inheritance //Polimorphism //Abstraction


//access modifier 
//public 
//private 
//protected 
//package

public class Machinary {

    public static void main(String[] args) {
        Car c1;
        //c1=new Car("carName1",101.1f,34343434343.65);
        c1=new Car();
        
        
        
        //memory allocation 
        
        // stack --> memory space cant be reusable 
        
        // dynamically --> memory space reusable  --> taking space from heap memory 
        
        /*
        c1.carModel=101.1f;
        c1.carName="carName1";
        c1.carPrice=34343434343.65;
        */
        System.out.println(c1.toString());
        
        
    }
}
