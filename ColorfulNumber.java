/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colourfulnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 *
 * @author Harshita V
 */
public class ColourfulNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String numstr=new BufferedReader(new InputStreamReader(System.in)).readLine();
        int num=Integer.parseInt(numstr);
        int l=numstr.length();
        int[] digits=new int[l];
        int ind=l-1;
        HashSet<Integer> ps=new HashSet<Integer>();
        while(num>0){
         digits[ind]=num%10;
        if(ps.contains(digits[ind])){System.out.println("not cf");
        return;
        }
        else{
        ps.add(digits[ind]);}
        
        num=num/10;
        ind--;
        }
        
        
        for(int x=1;x<l;x++)
        { int prod=1;
        for(int i=0;i<x;i++){
        prod=prod*digits[i];}
            for(int y=x;y<l;y++){
            if(ps.contains(digits[y]*prod)){System.out.println("not cf"); return;}
        else{
        ps.add(digits[y]*prod);
            
            }
            }
         System.out.println("cf"); 
        }
      
    }
    

}
