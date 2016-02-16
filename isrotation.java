/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isrotation;

/**
 *
 * @author Harshita V
 */
public class Isrotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      boolean rot= isrot("waterbottle","erbottlewat");
      System.out.println(rot);
        
    }
    public static boolean isrot(String s1,String s2){
    int len=s1.length();
    if(len==s2.length() && len>0){
        String s1s1=s1+s1;
        return isSubstring(s1s1,s2);
        
        
    }
    return false;
    }
     public static boolean isSubstring(String string1, String string2) {
       if(string1.contains(string2)){return true;}
       else{return false;}
    }
    
}
