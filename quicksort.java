/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

/**
 *
 * @author Harshita V
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    
    public static int[] quicksort(int[] arr,int left,int right){
    int i=left;
    int j=right;
    int pivot=arr[(left+right)/2];
    
    while(i<=j){
   
    while(arr[i]<pivot){i++;}
    while(arr[j]>pivot) j--;
    if(i<=j)
    {int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;}
    }
     //return pivot;
    if (left< j)
        {quicksort(arr,left,j);}
     if (i < right)
         quicksort(arr,i,right);
    return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={23,11,2,34,1};
        int[] newarr=quicksort(arr,0,4);
        for(int i=0;i<newarr.length;i++){System.out.println(newarr[i]);}
    }
    
}
