/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxconti;

/**
 *
 * @author Harshita V
 */
public class MaxConti {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] marray={2,23,12,2,56,3};
        int maxsum;
        maxsum = calcmax(marray,marray.length);
        System.out.println(maxsum);
    }
    public static int calcmax(int[] marray,int n){
      int maxsofar=marray[0];
     int curr=marray[0];
     for(int i=1;i<n;i++){
     curr=max(marray[i],curr+marray[i]);
     System.out.println(curr);
     maxsofar=max(maxsofar,curr);
     System.out.println(maxsofar);
     }
     
    return maxsofar;
    }
    public static int max(int a,int b){ 
        if (a>b)
        { return a;} 
        else
        { return b;}
    }
    }

