/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Package.Access03;

/**
 *
 * @author Ishti
 */
public class Access01 {
    public int num1,num2;

    public Access01(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Access01()
    {
        
    }
    void show()
    {
        Access03 c=new Access03();
        Access02 b=new Access02();
        b.num1=10;
        b.num2=20;
    }

    @Override
    public String toString() {
        return "Access01{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
