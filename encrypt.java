/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encrypt;
import java.io.Console;
import java.util.*;
/**
 *
 * @author Harshita V
 */
public class Encrypt {
 public static void encryption(String s, int n)
        {
            s = s.toUpperCase();
            char[] charsonly=s.toCharArray();
            int temp;
            for (int i=0;i<s.length();i++)
            {
                temp = (((int)(s.charAt(i)) - 64) * n) % 26;
                System.out.println(temp.toString());
            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         encryption("abcdef",4);
    }
    
}
