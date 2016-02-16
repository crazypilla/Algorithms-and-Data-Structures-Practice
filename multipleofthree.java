/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multipleofthree;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Harshita V
 */
public class Multipleofthree {

    /**
     * @param args the command line arguments
     */
    static int checkformultiple(int n){
    int odd_cnt=0,even_cnt=0;
    if(n<0){n=-n;}
    if(n == 0) return 1;
    if(n == 1) return 0;
    while(n>0){
    if((n & 1)==1){
        odd_cnt++;
    } 
    n = n>>1;
    if((1 & n)==1){ even_cnt++;
    }
    n=n>>1;
    
    
        }
    return checkformultiple(abs(odd_cnt-even_cnt));
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(checkformultiple(num)==1){
        System.out.println("multiple");}
        else{System.out.println("not multiple");}
        
    }
    
    
}
