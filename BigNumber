/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bignumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Harshita V
 */
public class Bignumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input: array of numbers.
        // output: biggest number to be formed from the array of numbers 
        // example: input: arr={23,43,112}, output: 4323112
        int[] arr={60,52,11,605};
        //convert to string as string operations are easier 
        String[] strlist=new String[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            strlist[i]=(((Integer)arr[i])).toString();
        }
        //sort the array based on a new comparator
        Arrays.sort(strlist,new Comparator<String>(){public int compare(String x,String y)
        {return (y+x).compareTo(x+y);}
        });
        
        //print output
        for(int j=0;j<arr.length;j++)
        {
        System.out.print(String.valueOf(strlist[j]));
        }
    }
    
}
