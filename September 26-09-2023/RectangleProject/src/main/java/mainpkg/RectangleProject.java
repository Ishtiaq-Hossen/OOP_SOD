/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mainpkg;

import java.util.Scanner;

/**
 *
 * @author Ishti
 *
 */

class Rectangle{
    float height,width;
    
    //this keyword;
    
    Rectangle(float height,float width)
    {
        this.height=height;
        this.width=width;
    }
    
    Rectangle()
    {
        
    }
    void areaCalculator()
    {
        System.out.println("The area of a rectangle is: "+height*width);
    }
    void permiterCalculator()
    {
        System.out.println("The perimeter of a rectangle is: "+(2*(width*height)));
    }
}
public class RectangleProject {

    public static void main(String[] args) {
        Rectangle a=new Rectangle();
        System.out.println("Input height and width: ");
        Scanner sc=new Scanner(System.in);
        a.height=sc.nextFloat();
        a.width=sc.nextFloat();
        
        a.areaCalculator();
        a.permiterCalculator();
    }
}
