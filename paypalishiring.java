/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paypalishiring;

import java.util.ArrayList;

/**
 *
 * @author Harshita V
 */
public class Paypalishiring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="paypalishiring";
        //int k=3;
        ArrayList al=new <Character> ArrayList();
        for (int i=0;i<str.length();i+=4)
        
        {
        System.out.print(str.charAt(i));
        //System.out.println("");
        al.add(str.charAt(i));}
      //  k--;
        System.out.println();
        for (int j=1;j<str.length();j+=2)
        
        { al.add(str.charAt(j));
          System.out.print(str.charAt(j));
        }
        //-;
         System.out.println();
        for(int k=2;k<str.length();k=k+4){
         System.out.print(str.charAt(k));
        }
        
        }
}
    

