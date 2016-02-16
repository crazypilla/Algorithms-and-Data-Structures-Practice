/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

/**
 *
 * @author Harshita V
 */
public class SORTING {

    /**
     * @param args the command line arguments
     */
    public static void bubblesort(int[] arr){
    
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
     int temp=0;   
     if(arr[j]<arr[i]){
     
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     
     }
    }}
    for (int k=0;k<arr.length;k++){System.out.println(arr[k]);}
    }

    
    public static void selectionsort(int[] arr){
    
    for(int i=0;i<arr.length-1;i++){
    int minindex=i; int min=0;
    int temp=arr[i];
    for(int j=i+1;j<arr.length;j++){
    
    if(arr[j]<arr[minindex]){min=arr[j];minindex=j;}
    
    
    }
    arr[i]=arr[minindex];
    arr[minindex]=temp;
    
    }
        
        
   
     for (int k=0;k<arr.length;k++){System.out.println(arr[k]);}
    
    
    }
    
    public static void insertionsort(int[] arr){
    int j,temp;
    for(int i=1;i<arr.length;i++){
    j=i;
    temp=arr[i];
    while((arr[i-1]>temp) && j>=0)
    { arr[i]=arr[i-1];
        j--;
    }
    arr[j]=temp;
    arr[i]=arr[j];
    
    
    
    }
    for (int k=0;k<arr.length;k++){System.out.println(arr[k]);}
    
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={23,6,2,3,5,1,34};
        insertionsort(arr);
    }
    
}
