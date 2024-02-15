/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrayList01;

import java.util.ArrayList;

/**
 *
 * @author Ishti
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        /*
        //=====2D array====/
        int[][] array02;
        array02=new int[2][];
      
        array02[0] =new int[2];
        array02[1] =new int[3];
        
        
        array02[0][0] =1;
        array02[0][1] =2;
        
        array02[1][0] =1;
        array02[1][1] =2;
        array02[1][2] =3;
        
        
        for(int i=0;i<array02.length;i++){
            for(int j=0;j<array02[i].length;j++){
                System.out.print(array02[i][j]+ " ");  
            }
            System.out.println("");
        }
        */
        
        
        //====1D array==/
        /*
        int[] array01;
        array01=new int[20];
        array01[0]=15;
        array01[1]=20;
        for(int i=0;i<array01.length;i++){
            System.out.println(array01[i]);
        }*/
        
        
        
        ArrayList<String>list=new ArrayList(); //data Type indicate 
        
        list.add("abc");
        list.add("abc2");
        
        System.out.println("List Size: "+ list.size());
        
        
        for(int i=0;i<list.size();i++){
            
            System.out.println(list.get(i));
        }
        
        
        //wrapper class
        
        //Integer ,Float,String ,Double 



    }
}
