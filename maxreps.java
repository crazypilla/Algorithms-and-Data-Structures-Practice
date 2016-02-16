/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxreps;

/**
 *
 * @author Harshita V
 */
public class Maxreps {

    /**
     * @param args the command line arguments
     */
    public static int maxrepnum(int[] arr){
    int n=arr.length;
    int max=0;int maxind=0;
    for(int i=0;i<arr.length;i++){
        arr[arr[i]%n]+=n;
    }
    for(int i=0;i<n;i++){
    if(max<arr[i]/n)
    {max=arr[i]/n;
    maxind=i;
    }}
    System.out.println(maxind);
    return maxind;
    //S
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={2,3,4,1,3,2,3,3,3};
        int [] newarr=arr;
        System.out.println(newarr[maxrepnum(arr)]);
    }
    
}
