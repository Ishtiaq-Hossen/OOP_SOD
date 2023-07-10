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

    // This is Main class
    
    // code will execute from this class
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello arnab!");
        Matrix m,m2;// declaring Matrix 
       
        //instantiate --> taking space from memory 
        m=new Matrix(3,3.5f,4.5,"Arnab",5);    
        m2=new Matrix();
        m2.doSome();
        m2.doSome(5);
        
        
        
        System.out.println(m2.toString());
                
        //initialize 
        //process 
        //output 
        
        
       
        
    }
    
}
