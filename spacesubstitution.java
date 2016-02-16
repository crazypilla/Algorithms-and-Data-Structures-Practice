/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addstr;

/**
 *
 * @author Harshita V
 */
public class Addstr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="harshita is a bad girl";
        String[] input=str.split(" ");
        StringBuffer sb=new StringBuffer();
        int i=0;
        
        int l=input.length;
        for(String s:input){
        sb.append(s);
        i++;
        if(i!=l){
        sb.append("%20");}
        }
        System.out.println(sb.toString());
    }
    
}
