/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mainpkg;

import java.util.Scanner;

/**
 *
 * @author Ishti
 */
public class MatrixBasic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        int[][] matrix;
        matrix=new int[2][];
        System.out.println("Input in matrix");
        for(int i=0;i<matrix.length;i++){
            System.out.print("Enter "+(i+1)+" row column no: ");
            int temp=sc.nextInt();
            matrix[i]=new int[temp];
            System.out.print("Enter "+(i+1)+" row column value: ");
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output of the matrix\n==============");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        */
        Object a=23.0f;
        System.out.println(((Object)a).getClass().getSimpleName());
        
    }
}
