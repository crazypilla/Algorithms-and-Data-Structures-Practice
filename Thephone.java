/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thephone;

/**
 *
 * @author Harshita V
 */

public class Thephone {
public static String digits="3456789";
public static int numlen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printnums(3);
    }
    public static void printnums(int num){numlen=num; printnums("");}
    public static void printnums(String prefix){
if(prefix.length()==numlen){System.out.println(prefix);}
for(int i=0;i<digits.length();i++){
if(prefix.length()>0){
if(prefix.charAt(prefix.length()-1)==(digits.charAt(i))){continue;}
if(prefix.length()>0&&digits.charAt(i)=='4'&&prefix.charAt(0)!='4'){continue;}
}
printnums(prefix+digits.charAt(i));


}

}
    
    }

