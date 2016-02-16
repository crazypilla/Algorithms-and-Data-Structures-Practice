/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortonetwozero;

/**
 *
 * @author Harshita V
 */
public class Sortonetwozero {

    /**
     * @param args the command line arguments
     */
     public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }}
    public static int[] sort(int[] arr){
    int n=arr.length;
    int low=0,high=n-1,mid=0;
    while(mid<=high){
    switch(arr[mid]){
        case 2: //swap(arr[low],arr[mid]);
                 int temp= arr[low];
                 arr[low]=arr[mid];
                 arr[mid]=temp;
                 low++;
                 mid++;
               break;
        case 1:mid++;
               break;
        case 0: int temp1= arr[mid];
                 arr[mid]=arr[high];
                 arr[high]=temp1;
                     high--;
                     break;
    
    }
    
    
    }
    printarray(arr);
    return arr;
    
    } 
    public static void swap(int a,int b){
    int temp=a;
    a=b;
    b=temp;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={0,2,1,0,0,2,1};
       sort(arr);
    }
    
}
