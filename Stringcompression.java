/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringcompression;

/**
 *
 * @author Harshita V
 */
public class Stringcompression {

    /**
     * @param args the command line arguments
     */
    public static String compress(String str){
    
    if(str==null)return null;
    int count=1;
    //int i=0;
    StringBuilder sb=new StringBuilder();
    char last=str.charAt(0);
    for(int i=1;i<str.length();i++){
    
    if(str.charAt(i)==last){count++;}
    else{
    
    sb.append(last);
    sb.append(count);
    count=1;
    last=str.charAt(i);
    
    
    }
    
    
    }
    sb.append(last);
    sb.append(count);
       
    if(sb.toString().length()>str.length())
       return (str);
    
    return sb.toString();
 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String str="abcc";
        System.out.println(compress(str));
    }
    
}
