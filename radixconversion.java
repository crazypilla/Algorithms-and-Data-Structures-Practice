/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radixconversion;

/**
 *
 * @author Harshita V
 */
public class Radixconversion {
   // private static boolean newinput;

    /**
     * @param args the command line arguments
     */
    public static int todec(int num){
    return 0;}
    public static int radixconversion(int d, int third){
    return 0;}
    public static void main(String[] args) {
        // TODO code application logic here
        int input=10101001;
        int sec=2;
        int third=10;
        int newinput=0;
        if (sec!=10){
         newinput= todec(input);
        }
        else{newinput=input;}
        if(third==10){System.out.println(newinput);}
        else { radixconversion(newinput, third);}}
    }
    
}
