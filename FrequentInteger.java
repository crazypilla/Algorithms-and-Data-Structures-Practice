/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frequentinteger;

/**
 *
 * @author Harshita V
 */


    /**
     * @param args the command line arguments
     */
    import java.util.HashMap;
import java.io.*;
import java.util.*;
public class FrequentInteger{

public static int freqint(int[] arr){ int max=0;int data=-1; int max2=0;
HashMap map=new HashMap<Integer,Integer>();  int count=0;
for(int i=0;i<arr.length;i++){ 
if(!map.containsKey(arr[i])){map.put(arr[i],1);}
else{ 
count=(int)map.get(arr[i]);
map.put(arr[i],count++);
if((int)map.get(arr[i])>max) {max=(int)map.get(arr[i]);

 data=arr[i];
}
}
}
return data;
}


public static void main(String[] args){
int[] arr={23,2,10,21,11,41,16,7,1,6,23,7};
int freq_int=freqint(arr);
System.out.println(freq_int);


}
}
