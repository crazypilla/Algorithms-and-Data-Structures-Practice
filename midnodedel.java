/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midnodedel;

/**
 *
 * @author Harshita V
 */
public class Midnodedel {

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
    public static void delmid(ListNode mid){
    
    
    if(mid==null||mid.next==null){System.out.println("Error");}
    ListNode nxt=mid.next;
    mid.data=nxt.data;
    mid.next=nxt.next;
    
    }
    public static ListNode partition(ListNode head,int k)
    {
    
    ListNode head1=null,head2=null,curr=head,n,head1curr=head1,head2curr=head2,n2,mid=null;
    while(curr!=null)
    {
        if(curr.data<k)
        {

        n=new ListNode(curr.data);
        if(head1==null)
          {head1=n;
           head1curr=head1;
          }
        else{
            head1curr.next=n;
            head1curr=n;
        }


        }
        else if(curr.data==k){ mid=new ListNode(curr.data);}
        else{
        n2=new ListNode(curr.data);
        if(head2==null){head2=n2;}
        else{
        head2curr.next=n2;
        head2curr=n2;
        }

        }
        curr=curr.next;
     }
        
    
    
        if(mid==null){
        head1curr.next=head2;
        }
        else{
            head1curr.next=mid;
            mid.next=head2;
        }
    
    
    
    
    
    
    
    return head1;
    }
    public static int begofcircloop(ListNode head){
    ListNode slowptr=head,fastptr=head;
    
    while(fastptr!=null && fastptr.next!=null){
    slowptr=slowptr.next;
    fastptr=fastptr.next.next;
    if(slowptr==fastptr){break;}
    
    
    }
    fastptr=head;
    while(fastptr!=slowptr)
    {
      
      fastptr=fastptr.next;
      slowptr=slowptr.next;
    
    }
    
    return slowptr.data;
    }
    public static ListNode findmid(ListNode head){
    
    ListNode slowptr=head,fastptr=head;
    while(fastptr!=null&&fastptr.next!=null)
    {fastptr=fastptr.next.next;
     slowptr=slowptr.next;
    
    }
    return slowptr;
    }
    public static ListNode reverse(ListNode head){
    ListNode prev=null,nextnode=null;
    ListNode curr=head;
    while(curr!=null){
     nextnode=curr.next;
     
     curr.next=prev;
     prev=curr;
     curr=nextnode;
     
    
    }
    
    
    return prev;
    }
    public static int findlength(ListNode head){
    ListNode curr=head;int l=0;
    while(curr!=null){l++;curr=curr.next;}
    return l;
    }
    public static boolean findpalindrome(ListNode head){
    ListNode head1=head,head2;
    int l=findlength(head);
   // System.out.println(l);
    //printlist(head);
    if(l%2==0){
    head1=head;
    head2=reverse(findmid(head));
    //printlist(head2);
    int count=0;
    while(count<l/2)
    { 
        
        System.out.println("EREREERE");
        System.out.println(head1.data+"   "+head2.data);
    if(head1.data!=head2.data) 
        return false;
    head1=head1.next; 
    head2=head2.next;
    count++;
    }
    
    
    }
    else {
    
    
    head1=head;
    head2=reverse(findmid(head.next));
    System.out.println(head2.data);
    while(head2!=null)
    {
    if(head1.data!=head2.data)
        return false;
    head1=head1.next;
    head2=head2.next;
    
    }
    
        
        
        
    
    }
    return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         ListNode ll1=new ListNode(1);
        ListNode ll2=new ListNode(2);
        ListNode ll3=new ListNode(4);
        ListNode ll4=new ListNode(2);
        ListNode ll5=new ListNode(1);
        //ListNode ll6=new ListNode(4);
        
        ll1.next=ll2;
        ll2.next=ll3;
        ll3.next=ll4;
        ll4.next=ll5;
       // ll5.next=ll6;
        //ll4.next=ll2;
        //partition(ll1,7);
       
        System.out.println(findpalindrome(ll1));
        
        
        
        
       
        
    }
    
}
