/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;

/**
 *
 * @author Harshita V
 */
public class BubbleSort {
    

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic 
        
        int arr[]={21,11,2,10,67,33};
        System.out.println(arr);
        int n=arr.length;
        for(int i =0; i<n; i++){
        System.out.println("initially sorted as"+arr[i]);
        }
        for(int i=0;i<n;i++)
        { //int min=i;
        for(int j=i+1;j<n;j++)
        {
            
            if(arr[j]<arr[i])
            {  //min=j;
             //swap(i,j,arr);
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        
        }
        
        }
        for(int i =0; i<n; i++){
        System.out.println("finally sorted as"+arr[i]);
        }
    }
    
}
