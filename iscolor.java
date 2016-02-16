/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iscolour;

import java.util.HashSet;

/**
 *
 * @author Harshita V
 */
public class Iscolour {

    /**
     * @param args the command line arguments
     */
    public static void istring(String str){
    int num=new Integer(str);
    int index=str.length()-1;
    int[] digits=new int[str.length()];
    HashSet<Integer> ps=new HashSet<Integer>();
    while(num>0)
    {
    digits[index]=num%10;
    if(!ps.contains(digits[index])){
    ps.add(digits[index]);
    }
    else{System.out.println("not colourful");
    System.exit(0);}
    num=num/10;
    index--;
    
    }
    for(int x=1;x<str.length();x++)
    { int prod=1;
    for(int i=0;i<x;i++){
    prod=prod*digits[i];
    
    }
    for(int y=x;y<str.length();y++){
    
    
        
        if(ps.contains(prod*digits[y])){
        System.out.println("not colourful");
        System.exit(0);}
        else{
            ps.add(prod*digits[y]);
        }
        
        
    
    }
   
    
    }
    
    System.out.println("colourful");
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String num="9234";
        istring(num);
    }
    
}
