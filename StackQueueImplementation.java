/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackqueueimplementation;

/**
 *
 * @author Harshita V
 */
class Node{ int val;
Node next;
Node(int x){
this.val=x;
next=null;}
}

class StackImpl{ 
Node top;

StackImpl(int x){ top=new Node(x);
top.val=x;
top.next=null;}
public Node peek(){
    if(top==null){return null;}
    else{ return top;}
}

public Node pop(){
    if(top==null){System.out.println("sorry no top available");return null;}
    else{ Node temp=new Node(top.val);top=top.next; return temp;}
}

public void push(Node n){if(n!=null){n.next=top;
top=n;}}

}
class QueueImpl{

Node first,last;
public void enqueue(Node n){
if(first==null){ first=n;
last=first;
}
else{ last.next=n;
         last=n;
}}
public Node dequeue()
{
if(first==null){return null;}
else{ Node temp=new Node(first.val);
first=first.next;
return temp;
}
}
}








public class StackQueueImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        StackImpl s=new StackImpl(5);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        QueueImpl q=new QueueImpl();
        System.out.println(q.dequeue());
        Node n=new Node(6);
        q.enqueue(n);
        
        System.out.println(q.dequeue());
    }
    
}
