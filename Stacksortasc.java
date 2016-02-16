/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacksortasc;

import java.util.Stack;

/**
 *
 * @author Harshita V
 */
public class Stacksortasc {

    /**
     * @param args the command line arguments
     */
    public static Stack stacksort(Stack st){
    Stack sorted=new Stack();
    while(!st.isEmpty())
    {
        int temp=(int) st.pop();
        while(!sorted.isEmpty()&& temp>(int)sorted.peek())
            {
                st.push(sorted.pop());
            }
        sorted.push(temp);
    }
    return sorted;}
    public static void main(String[] args) {
        // TODO code application logic here
            Stack st=new Stack();
            st.push(1);
            st.push(4);
            st.push(2);
            st.push(5);
            st.push(3);
            Stack s=stacksort(st);
            while(!s.isEmpty()){
                System.out.println((int)s.pop());
            }
            
            
    }
    
}
