/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackspush;

import java.util.Stack;

/**
 *
 * @author Harshita V
 */
public class Stackspush {

    /**
     * @param args the command line arguments
     */
    public static void toh(int n, Stack from, Stack to, Stack aux){
    
    if(n==1) 
        to.push(from.pop());
    else{
    toh(n-1,from,aux,to);
    to.push(from.pop());
    toh(n-1,aux,to,from);
    
    }
    
    
    
    
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Stack from=new Stack();
        Stack to=new Stack();
        Stack aux=new  Stack();
        from.push(1);
        from.push(20);
        from.push(3);
        from.push(4);
        int n=4;
        toh(n,from,to,aux);
        while(!to.isEmpty()){
        System.out.println((int)to.pop());}
    }
    
}
