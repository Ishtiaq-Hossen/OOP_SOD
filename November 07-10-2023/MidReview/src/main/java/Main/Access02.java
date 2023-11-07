/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ishti
 */
public class Access02 {
    protected int num1,num2;

    public Access02(int num1, int num2) {
        
        this.num1 = num1;
        this.num2 = num2;
    }
    public Access02()
    {
        
    }
    void show()
    {
        Access01 a=new Access01();
        a.num2=10;
        a.num2=12;
    }
    
}
