/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package duplicatesink;

import java.util.HashMap;

/**
 *
 * @author Harshita V
 */
public class Duplicatesink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[]={23,1,3,1,34,2,45,24,23};
        int k=3;
        HashMap map=new HashMap();
        
        for(int i=0;i<nums.length;i++){
        
        if(map.containsKey(nums[i])){
        
        int min=Math.abs((int)map.get(nums[i])-i);
        if(min<=k){System.out.println("true");}
        }
        map.put(nums[i], i);
        }
        System.out.println ("false");
    }
    
}
