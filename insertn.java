/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertn;

/**
 *
 * @author Harshita V
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harshita V
 */
public class Insertn {

    /**
     * @param args the command line arguments
     */
    public static int[] instsort(int[] arr){
    //int swapped=1;
    int n=arr.length;
    
    for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while((arr[j]>key)&&(j>=0)){
            
            arr[j+1]=arr[j];
            j--;
        }
       arr[j+1]=key;
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
          printarr(instsort(arr));
    }
    
}
