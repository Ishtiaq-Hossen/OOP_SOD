/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

// This is Matrix class
public class Matrix {
    public int val;
    public float val2;
    public double val3;
    
    public String val4;
    private int k;
    public void doSome()
    {
        
        System.out.println(k+"matrix doing something!");
    }
    public void doSome(int cola)
    {
        
        System.out.println(k+"overloaded method");
    }
    /*
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }*/
    
    public Matrix(int val, float val2, double val3, String val4, int k) {
        this.val = val;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.k = k;
    }
    //contructor is a kind of method 
    //method overloading 
    public Matrix(int val, float val2) {
        this.val = val;
        this.val2 = val2;
    }
    public Matrix ()
    {
        
    }

    @Override
    public String toString() {
        return "Matrix{" + "val=" + val + ", val2=" + val2 + ", val3=" + val3 + ", val4=" + val4 + ", k=" + k + '}';
    }
    
    
    
    
    
}
