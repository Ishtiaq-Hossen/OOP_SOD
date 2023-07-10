/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg.Main;

/**
 *
 * @author Ishti
 */
public abstract class Matrix {
    public int val,val2;
    public String name;
    public int add()
    {
        int temp=val+val2;
        return temp;
    }
    //overloading
    public Matrix(int val, int val2) {
        this.val = val;
        this.val2 = val2;
        
    }
    public Matrix(int val, int val2, String name) {
        this.val = val;
        this.val2 = val2;
        this.name = name;
    }
    public Matrix()
    {
        
    }
    abstract void someWork();
    
    
    //abstract class & abstract method 
    
    
}
