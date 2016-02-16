/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graycode;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Harshita V
 */
public class GrayCode {

    /**
     * @param args the command line arguments
     */
    public static List graycode(int n){

        List ret=new LinkedList();
        ret.add(0);
        for(int i=0;i<n;i++){
        int size=ret.size();
        for(int j=size-1;j>=0;j--){
        
        ret.add((int)ret.get(j)+size);
        }
        
        
        }
    
    
    
    
    return ret;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=6;
        System.out.println(graycode(n));
    }
    
}
