/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mainpkg;

import java.util.Scanner;

/**
 *
 * @author Ishti
 */
class classA{
    public int a=10;
    //method 2 types 
    // void method
    // method that have a return type 
    
    //access specifier : private,public ,package,protected 
    
    
    classA(int b){
        a=b;
    }
    classA(){
        
    }
    void setInt(int b)
    {
        
        a=b;
        
    }
    int getInt(){
        return a;
    }
}
public class FunctionBasic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        float b=20.0f;
        String c="name1";
        double d=20.3;
        
        
        //array 
        // what is an array ?
        //collection of data 
        
        int[] array;
        System.out.println("Input array length");
        int temp=sc.nextInt();
        System.out.print("Input "+temp+" value: ");
        array=new int[temp];
        
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        /*
        for(int i=0;i<array.length;i++){// for loop
            System.out.print(array[i]+" ");
        }*/
        
        // for each loop 
        for(Object ax: array){
            System.out.print(" "+ax);
        }
        
        
        
        //new classA();
        // stack memory and heap memory 
        /*
        classA name1=new classA(23);
        System.out.println(name1.a);
        name1.setInt(23);
        System.out.println(name1.a);
        System.out.println(name1.getInt());
        */
    }
}
