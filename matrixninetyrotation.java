/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixninetyrotation;

import java.util.ArrayList;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author Harshita V
 */
public class Matrixninetyrotation {

    /**
     * @param args the command line arguments
     */
    public static class Point{int x; int y;
 Point(int x,int y){this.x=x;this.y=y;}}
    
    public static void rotatematrix(int[][] mat){
        ArrayList al=new ArrayList();
        int n=mat.length;
        //int cols=mat[0].length;
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    Point p=new Point(i,j);
    if((n-1-i)>=0){
    Point p2=new Point(j,n-1-i);
    if(!al.contains(p)&&!al.contains(p2)){
        //swap(mat,i,j);
        int temp=mat[i][j];
        mat[i][j]=mat[j][(n-1-i)];
        mat[j][(n-1-i)]=temp;
    
    }
    
    al.add(p);
    al.add(p2);
    
    
    
    }
   
    }
    
    }
    print(mat);
    }
    public static void print(int[][] mat){
    
    for(int i=0;i<mat.length;i++){
        System.out.println(" ");
        
        for(int j=0;j<mat[0].length;j++)
        
        {System.out.print(mat[i][j]);}}
    
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        print(mat);
        System.out.println("*******");
       // rotatematrix(mat);
        
        
        rotateMatrix2(mat);//transpose(mat);  System.out.println("*******");
          System.out.println("*******");
        //print(mat);
    }
    
    public static void transpose(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for(int i = 0 ; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[i][j] = mat[j][i];
            }
        }
        for(int i = 0 ; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = result[i][j];
            }
        }
    }
    
    public static void rotateMatrix2(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        int n = mat.length;
        for(int i = 0 ; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[j][n-1-i] = mat[i][j];
            }//print(result);System.out.println("*******");
        }
        print(result);
    }
}
