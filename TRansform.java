/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transform;

import java.util.Scanner;

/**
 *
 * @author Harshita V
 */
public class TRansform {

    /**
     * @param args the command line arguments
     */
    public static int reverse(int num){
    int reverse=0;
    StringBuilder sb=new StringBuilder(((Integer)num).toString());
    String rev=sb.reverse().toString();
    reverse=Integer.parseInt(rev);
    return reverse;
    }
    public static boolean ispalindrome(int num){
    String numstr=((Integer)num).toString();
    for(int i=0;i<numstr.length();i++)
    {
      if(numstr.charAt(i)!=numstr.charAt(numstr.length()-i-1)){
      return false;
      }
    
    }
    return true;
    }
    public static int palindrome(int n){
        
    if(ispalindrome(n)){return n;}    
    int newnum=0;
    int reverse=reverse(n);
    newnum=n+reverse;
    if(newnum>1000000000){return -1;}
    if(ispalindrome(newnum)) return newnum;
    else return -1;
    //return newnum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("enter n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(palindrome(n));
        
    }
    
}
