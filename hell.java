/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hell;

/**
 *
 * @author Harshita V
 */
public class Hell {

    public static void findfactor(int n)
 {
  System.out.println("1, "+n+" ");
  int count=2;
  for(int i=2;i<=Math.sqrt(n);i++)
  {
   
  // for(int j=i+1;j<n;j++)
   {
    if(n%i==0){int x=n/i;
    System.out.println(i+" "+x);
    if(i==x) count=count+1;
    else
    count=count+2;
    }
    
    
   }
   
  }
  System.out.println(count);
 }
 
 
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  findfactor(9);
 }
}
