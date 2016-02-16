/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reverse;

import java.util.Scanner;

/**
 *
 * @author Harshita V
 */
class Reverse
{
   //A method for reverse
   
   public static void main(String args[])
   {
	int num=0;
	System.out.println("Input your number and press enter: ");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
        
        int rev=0;
        while(num>0){
        
        rev=rev*10+num%10;
        num=num/10;
        
        }
	System.out.print("rev of the input number is:");
	//reverseMethod(num);
	System.out.println(rev);
   }
}
//Output:
