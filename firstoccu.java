/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstoccu;

/**
 *
 * @author Harshita V
 */
public class Firstoccu {

    /**
     * @param args the command line arguments
     */
    public static int firstocc(int [] arr,int low,int high,int data){
    
    
    if(low<=high){
    int mid=low+((high-low)/2);
    if((arr[mid]==data)&&(low==mid || arr[mid-1]<data) )
        return mid;
    else if(arr[mid]>=data){ return firstocc(arr,low,mid-1,data);}
    else return firstocc(arr,mid+1,high,data);
    }
    
    return -1;}
    public static void main(String[] args) {
        // TODO code application logic here
         int [] arr={1,2,3,3,4,5,3,3,2,1};
       // int [] newarr=arr;
        System.out.println(firstocc(arr,0,9,3));
    }
    
}
