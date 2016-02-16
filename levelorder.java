/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package levelorder;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Harshita V
 */
public class Levelorder {

    /**
     * @param args the command line arguments
     */
    public static class BinaryTreeNode{
    private BinaryTreeNode leftNode,rightNode;
    private int data;
    BinaryTreeNode(int x){
        data=x;
    rightNode=null;  leftNode=null;}
    
    public void setdata(int data){this.data=data;}
    
    public int getdata(){return this.data;}
    public void setright(BinaryTreeNode n){this.rightNode=n;}
   public void setleft(BinaryTreeNode n){this.leftNode=n;}
    public BinaryTreeNode getright(){return this.rightNode;}
    public BinaryTreeNode getleft(){return this.leftNode;}
  
    
    }
    public void order(BinaryTreeNode root){ 
    Queue q=new<BinaryTreeNode> LinkedList();
    q.add(root);
    if(!q.isEmpty()){
    BinaryTreeNode x = (BinaryTreeNode) (q.remove());
    System.out.println(x.getdata());
    if(x.getleft()!=null){q.add(root.getleft());}
    else if(x.getright()!=null){q.add(root.getright());}
    }
    //q.delete();
    }
    public static int height(BinaryTreeNode root){ int leftht,rightht;
        if(root==null){return 0;}
        else{ 
        leftht=height(root.getleft());
        rightht=height(root.getright());
        if(leftht<rightht){ return rightht+1;}
        else return leftht+1;
        }
    } 
        
        
        //return 0;}
    // 4.1
    public boolean checkforbalanced(BinaryTreeNode root)
    {
   
    if(Math.abs(height(root.getleft())- height(root.getright()))>1)
    {   
     return false;}
    
    
    
    return true;
    }
  
    
    // 4.5
    public boolean checkforbst(BinaryTreeNode root,Integer min,Integer max){
     
     if(root==null){return true;}
     if((min!=null&& root.data<=min)||(max!=null&& root.data>max)){return false;}
     if(!checkforbst(root.getleft(),min,root.getdata())||!checkforbst(root.getright(),root.getdata(),max))
     {return false;}
     return true;
     }
    public boolean checkforbst(BinaryTreeNode root){
        return checkforbst(root,null,null);

    }
    public static BinaryTreeNode insertintobst(BinaryTreeNode root,int data){
        //if(root!=null)System.out.println(root.getdata());
    try{if(root==null){ root=new BinaryTreeNode(data); }
    else{
    if(data<=root.getdata()){root.setleft(insertintobst(root.getleft(),data));}
    else if(data>root.getdata()){root.setright(insertintobst(root.getright(),data));}
    }
    }catch(Exception e){}
    finally{ printbst(root);}
    return root;
    
    }
    public static void printbst(BinaryTreeNode root){
        if(root==null){return;}
       printbst(root.getleft());
    System.out.println(root.getdata());
    printbst(root.getright());}
    
    
    public static void createbst(int[] arr){
    BinaryTreeNode root=new BinaryTreeNode(arr[0]);
    for(int i=1;i<arr.length;i++){
    insertintobst(root,arr[i]);}
    
    
    
    
    }
    
    
    //4.3
    public static BinaryTreeNode createminbst(int[] arr,int start,int end){
    if(end<start){return null;}
    int mid=(start+end)/2;
    BinaryTreeNode root=new BinaryTreeNode(arr[mid]);
    root.setleft(createminbst(arr,start,mid-1));
    root.setright(createminbst(arr,mid+1,end));
    return root;
    
    
    }
    
    
    
    //4.7
        public static int  findLCA(BinaryTreeNode root1, BinaryTreeNode node1,BinaryTreeNode node2){
            System.out.println(root1.getdata());
        if(root1==null) {return 0;}
        else if(node1.getdata()==node2.getdata()){return node1.getdata();}
        else if(root1.getleft().getdata()==root1.getright().getdata()){return root1.getdata();}
        else if(findLCA(root1.getleft(),node1,node2)==0)
        {return findLCA(root1.getleft(),node1,node2);}
        else {return findLCA(root1.getright(),node1,node2);}
        
      
      // return root1.getdata();
        
        
        }
     public static BinaryTreeNode inordersuccessor(BinaryTreeNode root, BinaryTreeNode node){
     
     if(node.getleft()==null&&node.getright()==null)
     {return getparent
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             }
     
     
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Levelorder l=new Levelorder();
        BinaryTreeNode x=new BinaryTreeNode(6);
        BinaryTreeNode y=new BinaryTreeNode(10);
        BinaryTreeNode z=new BinaryTreeNode(9);
        BinaryTreeNode k=new BinaryTreeNode(99);
        BinaryTreeNode m=new BinaryTreeNode(91);
        x.setleft(y);
        x.setright(z);
       // y.setleft(k);
      // k.setleft(m);
        //l.order(x);
       // System.out.println(l.checkforbst(x));
        int[] array={12,15,18};

      /*  BinaryTreeNode mmmm = createminbst(array,0,array.length-1);
        System.out.println(mmmm.getdata());
        System.out.println(mmmm.getleft().getdata());
        System.out.println(mmmm.getright().getdata());
        */
        
     // printbst(createminbst(array,0,array.length-1));
      System.out.println(findLCA(x,y,z));
        
    }
    
}

