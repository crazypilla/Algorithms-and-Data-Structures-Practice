/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package happynumber;

import java.util.ArrayList;

/**
 *
 * @author Harshita V
 */
public class Happynumber {

    /**
     * @param args the command line arguments
     */
    public static ArrayList al= new ArrayList();
    public static int ctr=0;
    public static void ishappy(int num){
    
    String numstr=Integer.toString(num);
    int[] arr=new int[numstr.length()];
    for(int i=0;i<(numstr.length());i++){
        arr[i]=numstr.charAt(i)- '0';
    } 
    int sum=0;
    //int ctr=0;
    for(int i=0;i<arr.length;i++){
        //System.out.println(arr[i]);
       sum+=arr[i]*arr[i];
    }
    //System.out.println(sum);
    al.add(sum);
    
    if(sum>1 && !al.contains(sum)){
        //System.out.println(ctr);
        //ctr=ctr+1;
    ishappy(sum);
    }
    else if (sum==1)
    {
       System.out.println("is happy"+" "+ctr);
      ctr =0;
    
    }
    else if(al.contains(sum)){ System.out.println("is not happy"+" "+ctr); //System.out.println(ctr);
    al.clear();
    ctr=0;
    }
    else{System.out.println("is not happy");
    System.out.println(ctr);
    
    al.clear();
    ctr=0;
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num=45;
       int[] arr={4489,
5,
1,
200,
47901,
73,
227661,
347,
6536,
83};
       
       for(int i=0;i<arr.length;i++)
           
       { //ArrayList al=new ArrayList();
           ishappy(arr[i]);
        // ArrayList al=new ArrayList();
       }
       
    }
    
}
