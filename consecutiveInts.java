/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consecutiveints;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Harshita V
 */
public class Consecutiveints {

    /**
     * @param args the command line arguments
     */
    
public static boolean check_for_k(int[] arr, int k){


  


       Set<Integer> set=new HashSet<Integer>();
//add it to the set to avoid the duplicates
       for(int i:arr){
           set.add(i); 
       }
       int max=0;
       int start=0; // to store the first element of the longest sequence
       for(int i:arr){
           int left=i-1;
           int right=i+1;
           int count=1;
           while(set.contains(left)){
               set.remove(left--);
               count++;
           }
           while(set.contains(right)){
               set.remove(right++);
               count++;
           }
           
           if(max<count){
               max=count;
               start=left+1;
           }
       }
       
       System.out.println();
       if(max==k){return true;}
       return false;
    }
         
            
        
  
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int k=3;
        int[] arr={30,19,32,12,31};
        System.out.println( check_for_k(arr,k));
        
    }
    
}
