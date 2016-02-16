/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package looksay;

/**
 *
 * @author Harshita V
 */
public class LookSay {

    /**
     * @param args the command line arguments
     */
    public static void printseries(String num,int lim){
    if(lim==10){System.exit(0);}
    if(lim==1){
    System.out.println(num);}
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<num.length();)
    {
    int count=1;
    char curr=num.charAt(i);
    i++;
    while(i<num.length()&&curr==num.charAt(i)){i++; count++;}
    sb.append(count).append(curr);
    }
    System.out.println(sb);
    printseries(sb.toString(),++lim);
    
    
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        printseries("1",1);
    }
    
}
