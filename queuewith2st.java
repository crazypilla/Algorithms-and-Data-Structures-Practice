/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queuewith2st;

import java.util.Stack;

/**
 *
 * @author Harshita V
 */
public class Queuewith2st {

    /**
     * @param args the command line arguments
     */
    public static Stack st1=new Stack();
      public static   Stack st2=new Stack();
    public void enqueue(int data){
        
    st1.push(data);
    
    
    
    }
    public  int dequeue(){
        
    //if(st1.isEmpty()) return -1;
    while(!st1.isEmpty()){
    
    st2.push(st1.pop());
    }
    if(st2.isEmpty()) return -1;
    
   return (int)st2.pop();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Queuewith2st q=new Queuewith2st();
        q.enqueue(5);
        q.enqueue(233);
        q.enqueue(45);
        q.enqueue(2);
        q.enqueue(34);
        q.enqueue(1);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
    
}
