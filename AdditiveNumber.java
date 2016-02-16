/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package additivenumber;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Harshita V
 */
public class AdditiveNumber {

    /**
     * @param args the command line arguments
     */
    public static boolean an(int number){
    //int number = 123459729;
		Stack<Integer> s = new Stack<Integer>();
		
		int div = number;
		int quotent = 0;
		int number_digit = 0;
	
		
		// calculating number of digits in the number
		while(div!=0)
		{
			quotent = div%10;
			s.push(quotent);
			div = div/10;
			number_digit++;
		}
		
		// inserting the number in the original format in array from stack
		int num[] = new int [number_digit];
		for(int i=0; i<number_digit;i++)
			num[i] = s.pop();
		
		//System.out.println(number_digit);
		
		
		// calculating the number possible of digit we can allocate in each part i.e a can 1 of a can be 12
		int i = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(i=1;i*3<=number_digit;i++)
		{
			int j = i*3;
			if(number_digit%j==0)
				list.add(i);
		}
		
		boolean flag = true;
		
		for(int x=0; x<list.size(); x++)
		{
			i = list.get(x);
			flag = true;
			for(int j=0; j<num.length;)
			{
				int a=0,b=0,c=0;
				for(int k=i-1; k>=0; k--)
				{
					a = (int) (a + Math.pow(10, k)*num[j++]);
				}
				
				for(int k=i-1; k>=0; k--)
				{
					b = (int) (b + Math.pow(10, k)*num[j++]);
				}
				for(int k=i-1; k>=0; k--)
				{
					c = (int) (c + Math.pow(10, k)*num[j++]);
				}
				
				System.out.println(a+" ,"+b+" ,"+c);
				
				if(a+b!=c)
				{
					flag = false;
					break;
				}
				
			}
			
			if(flag==true)
				break;
		}
		return flag;
		
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=123458;i<123500;i++){
            boolean s=an(i);
            if(s==true){System.out.println(i);}
        }
    }
    
}
