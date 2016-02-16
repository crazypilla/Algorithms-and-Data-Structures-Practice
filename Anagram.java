/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anagram;

/**
 *
 * @author Harshita V
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main (String args[]){
String input = "AbcDe";
reorderString(input, "");


}

public static void reorderString(String test, String res){

//char[] temp = test.toCharArray();
System.out.println(res+test);

if (test.length()==1){
System.out.println(res+test);
} else {
int i;
for (i=0;i<test.length();i++){
if ('a'<=test.charAt(i)&& test.charAt(i)<='z'){
for (int j=i+1;j<test.length();j++){

if ('a'<=test.charAt(j)&& test.charAt(j)<='z'){

char[] temp = test.toCharArray();
char tempchar = temp[i];
temp[i]=temp[j];
temp[j]= tempchar;
String newString=new String (temp);

reorderString(newString.substring(i+1,test.length()), res+newString.substring(0,i+1));
}
}

}   `
}

}

}


    
    
}
    
    
    

