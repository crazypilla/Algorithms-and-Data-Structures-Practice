/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simple;

/**
 *
 * @author Harshita V
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void simplesort(int[] arr){
        
        for(int i=arr.length-1;i>=0;i--){
        for(int j=0;j<i+1;j++){
        if(arr[i]<arr[j]){int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;}}
        
        }
        
        printarr(arr);
    }
     public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }}
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr={23,14,12,1,5,6};
        simplesort(arr);
    }
    
}
