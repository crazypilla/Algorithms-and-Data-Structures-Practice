/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pairs;

import java.util.HashSet;

/**
 *
 * @author Harshita V
 */
public class Pairs {

    /**
     * @param args the command line arguments
     */
    
    public static void findpairs(int[] arr, int sum){
    
    HashSet hash=new HashSet();
    for(int i=0;i<arr.length;i++){
    if(hash.contains(sum-arr[i])){System.out.println(arr[i]);System.out.println(sum-arr[i]);}
    else{hash.add(arr[i]);}
    }
  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr={23,1,8,2,9,5};
        int sum=10;
        findpairs(arr,sum);
    }
    
}
