/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumofll;

/**
 *
 * @author Harshita V
 */
public class Sumofll {

    /**
     * @param args the command line arguments
     */
    public static class ListNode{
    int data;
    ListNode next;
    ListNode(int d){this.data=d;}
    
    }
    public static void printlist(ListNode head){
    
    ListNode curr=head;
    while(curr!=null){
    System.out.println(curr.data);
    curr=curr.next;
    }
    
    }
    public static int findlength(ListNode head){
    ListNode curr=head;int l=0;
    while(curr!=null){l++;curr=curr.next;}
    return l;
    }
   public static ListNode sumofll(ListNode head1,ListNode head2){
   
   ListNode res=null,curr1,curr2,curr,n;
   int d=0,r=0,sum=0;
   int l1=findlength(head1);
   int l2=findlength(head2);
   
   { 
       curr1=head1;
       curr2=head2;
       curr=res;
   while(curr1!=null&&curr2!=null){
   if(curr==null){
   
   d=(curr1.data+curr2.data)%10;
   r=(curr1.data+curr2.data)/10;
   res=new ListNode(d);
   curr=res;
   }
   else{
   d=(curr1.data+curr2.data)%10;
   
   sum=d+r;
   n=new ListNode(sum);
   r=(curr1.data+curr2.data)/10;
   curr.next=n;
   curr=curr.next;
   
   
   }
   curr1=curr1.next;
   curr2=curr2.next;
   }
   
   }
   

   return res;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListNode ll1=new ListNode(4);
        ListNode ll2=new ListNode(1);
        ListNode ll3=new ListNode(2);
        ListNode ll4=new ListNode(4);
        ListNode ll5=new ListNode(1);
        ListNode ll6=new ListNode(2);
        ListNode ll7=new ListNode(3);
        ll1.next=ll2;
        ll2.next=ll3;
        ll3.next=ll4;
        ll5.next=ll6;
        ll6.next=ll7;
        
        
        printlist(sumofll(ll1,ll5));
    }
    
}
