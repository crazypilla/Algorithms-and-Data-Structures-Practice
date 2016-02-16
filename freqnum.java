/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freqnum;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Harshita V
 */
public class Freqnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={2,3,33,4,2,3,4,4,2,3,4,4,4,2,2,1,1,88,8,8};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (int i : arr) {
    Integer count = map.get(i);
    map.put(i, count != null ? count+1 : 0);
}
Integer popular = Collections.max(map.entrySet(),
    new Comparator<Map.Entry<Integer, Integer>>() {
    @Override
    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}).getKey();
System.out.println(popular);
           }
            
        }
    
        
    
    

