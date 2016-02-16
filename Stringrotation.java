/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringrotation;

/**
 *
 * @author Harshita V
 */
public class Stringrotation {

    /**
     * @param args the command line arguments
     */
    public static boolean issubstring(String str1,String str2){ int count=0;
    
    for(int i=0;i<str1.length()-str2.length()+1;i++){
    
    for(int j=0;j<str2.length();j++){
    
    if(str1.charAt(i+j)==str2.charAt(j)){count++;}
    else break;
    }
    }
    if(str2.length()==count)
     return true;
    
    return false;
}
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="abcdef";
        String str2="abcde";
        System.out.println(issubstring(str1,str2));
        String s3="watterbottle";
        String s4="erbottlewat";
        System.out.println((s3+s4).contains(s3));
        
        
    }
    
}
