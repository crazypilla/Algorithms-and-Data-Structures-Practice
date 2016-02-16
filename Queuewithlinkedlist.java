/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queuewithlinkedlist;

/**
 *
 * @author Harshita V
 */

public class Queuewithlinkedlist {

    public static class Node
        {
            public int data;
           Node next;
            public Node(int data){
           this.data=data;
            this.next=null;
            }
            public int getdata()
            {return this.data;}
            public void setdata(int dat)
            {this.data=dat;}
            public Node getNext()
            {return this.next;}
            public void setNext(Node next)
            {this.next=next;}
        }

      private Node frontnode;
      private Node rearnode;
      public Queuewithlinkedlist(){
      
      this.frontnode=null;
      this.rearnode=null;
      }
      public boolean isEmpty(){
      return frontnode==null;
      }
      public void enqueue(int data)
      { Node n=new Node(data);
        if(frontnode==null&&rearnode==null)
        { frontnode=n;
        rearnode=n;}
        else{
         rearnode.setNext(n);
         rearnode=rearnode.getNext();
        }
      }
      public Node dequeue(){
      Node n=frontnode;
      n.setNext(null);
      frontnode=frontnode.getNext();
      return n;
      }
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Queuewithlinkedlist qll=new Queuewithlinkedlist();
        qll.enqueue(34);
        qll.enqueue(23);
        System.out.println(qll.dequeue().getdata());
         System.out.println(qll.dequeue().getdata());
    }
    
}
