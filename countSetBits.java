/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countsetbits;

/**
 *
 * @author Harshita V
 */
public class Countsetbits {

    /**
     * @param args the command line arguments
     */
    public static void countsetbits(int n)
     { int count=0;
         String str=Integer.toBinaryString(n);
       for(int i=0;i<str.length();i++){
       if(str.charAt(i)=='1')
           count++;
       
       }
      System.out.println(count);
     
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1234;
        countsetbits(num);
        System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()));
        
    }
    
}
