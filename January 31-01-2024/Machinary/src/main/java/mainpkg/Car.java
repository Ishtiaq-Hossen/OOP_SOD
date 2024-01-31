/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Ishti
 */
public class Car {
    String carName ;
    float carModel;
    double carPrice;
    
    
    //method overloading 
    Car(String carName ,float carModel,double carPrice){
        this.carName=carName;
        this.carModel=carModel;
        this.carPrice=carPrice;
    }
    Car()
    {
        
    }
    

    @Override
    public String toString() {
        return "Car{" + "carName=" + carName + ", carModel=" + carModel + ", carPrice=" + carPrice + '}';
    }
    
    
    //datatype overloading 
    void carSound(){
        System.out.println("Sound of a general car");
    }
    
}
