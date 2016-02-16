/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marixrotation;

import java.util.ArrayList;

/**
 *
 * @author Harshita V
 */
public class Marixrotation {

    /**
     * @param args the command line arguments
     */
    public static void makezeros(int[][] mat){
    ArrayList rowlist=new ArrayList();
    
    ArrayList collist=new ArrayList();
    for(int i=0;i<mat.length;i++){
     for(int j=0;j<mat[0].length;j++){
         if(mat[i][j]==0){
         rowlist.add(i);
         collist.add(j);
         
         }
   
     }}
     System.out.println(rowlist+"  "+collist);
    for( int r=0;r<mat.length;r++){
    if(rowlist.contains(r)){    
    for( int k=0;k<mat[0].length;k++){
    {
    mat[r][k]=0;
    
    }
    }
    
    }
    }
    for(int l=0;l<mat.length;l++){
    for(int m=0;m<mat[0].length;m++){
    if(collist.contains(m))
    {mat[l][m]=0;}
    
    }
    
    }
    for(int h=0;h<mat.length;h++)
    {for(int z=0;z<mat[0].length;z++)
        {System.out.print(mat[h][z]);}}
    
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix={{2,0,4},{5,6,0},{8,9,11}};
        makezeros(matrix);
        
        
    }
    
}
