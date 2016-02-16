/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package select;

/**
 *
 * @author Harshita V
 */
public class Select {

    
    public static int[] selsort(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
    int min=i;
    for(int j=i+1;j<n;j++){if(arr[j]<arr[min]){
    min=j;}}
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i]=temp;
    }
    
    return arr;
    }
     public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={45,2,75,12,34};
          printarr(selsort(arr));
    }
    
}
