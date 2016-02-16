/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package replacement;

import java.util.Arrays;

/**
 *
 * @author Harshita V
 */
public class Replacement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input="I am a girl";
        String[] arr=input.split(" ");
        for(int i=0;i<arr.length;i++){System.out.println(arr[i]);
        if(arr[i].equals("a")){arr[i]="the";}
        }
        for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}
        //String x=arr.toString();
        System.out.println((Arrays.toString(arr)));
    }
    
}
