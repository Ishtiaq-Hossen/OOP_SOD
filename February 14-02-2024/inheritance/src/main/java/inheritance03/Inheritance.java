/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inheritance03;

import java.util.Scanner;

/**
 *
 * @author Ishti
 */

// Inheritance ,Abstraction ,Polymorphism ,Encapsulation 

//model class 

class Abc {
    int a,b ;
    String c;
    //method overloading 
    
    public Abc(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Abc(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Abc(){
        
    }
    
}
class Efg extends Abc {
    int b1, c1;

    public Efg(int b1, int c1, int a, int b, String c) {
        super(a, b, c);
        this.b1 = b1;
        this.c1 = c1;
    }
    
}


class Def extends Efg{

    public Def(int b1, int c1, int a, int b, String c) {
        super(b1, c1, a, b, c);
    }    
    
}

//abstraction 
abstract class Ijh{
    String at0,at1;
    int likeNo,subscriptionNo;
    abstract void featureUpdate();
}

class Klm extends Ijh{

    @Override
    void featureUpdate() {
        System.out.println("Feature updated in Klm Class");
    
    }
    
}

class Nop extends Ijh{

    @Override
    void featureUpdate() {
        System.out.println("Feature updated in Nop Class");
    
    }
    
}


public class Inheritance {

    public static void main(String[] args) {
        //Abc a=new Abc(5,10,"abc");
        Abc a=new Abc(5,10);
        Efg b=new Def(6,7,8,9,"bcd");
        
        Klm c=new Klm();//Klm class extends parent class(abstract Ijh)
        c.featureUpdate();
         
        
        Nop d=new Nop();//Nop class extends parent class(abstract Ijh)
        d.featureUpdate();
        
        
        final int a1;
        Scanner r=new Scanner(System.in);
        a1=r.nextInt();
        System.out.println(a1);
        
        
        
    }
}
