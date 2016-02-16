/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dupsinunsortedll;

import java.util.ArrayList;

/**
 *
 * @author Harshita V
 */
public class Dupsinunsortedll {

    /**
     * @param args the command line arguments
     */
    public static class ListNode{
    int data;
    ListNode next;
    ListNode(int d){this.data=d;}
    
    }
    public static ListNode removedups(ListNode head){
     if(head==null) return null;
    
    ArrayList al=new ArrayList();
    
    ListNode curr=head;
    ListNode prev=head;
    ListNode n=head;
    while(curr!=null){
    
    if(!al.contains(curr.data))
    {al.add(curr.data);
    prev=curr;
    curr=curr.next;}
    else{ n=curr.next;
    prev.next=n;
    curr=n;

    }
    }
    
   
    return head;
    }
    public static void printlist(ListNode head){
    
    ListNode curr=head;
    while(curr!=null){
    System.out.println(curr.data);
    curr=curr.next;
    }
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode ll1=new ListNode(4);
        ListNode ll2=new ListNode(4);
        ListNode ll3=new ListNode(4);
        ListNode ll4=new ListNode(4);
        ListNode ll5=new ListNode(4);
        ListNode ll6=new ListNode(4);
        ListNode ll7=new ListNode(4);
        ListNode ll8=new ListNode(4);
        ListNode ll9=new ListNode(4);
        ListNode ll10=new ListNode(4);
        ll1.next=ll2;
        ll2.next=ll3;
        ll3.next=ll4;
        ll4.next=ll5;
        ll5.next=ll6;
        ll6.next=ll7;
        ll7.next=ll8;
        ll8.next=ll9;
        ll9.next=ll10;
        //removedups(ll1);
        printlist(removedups(null));
        
    }
    
}
