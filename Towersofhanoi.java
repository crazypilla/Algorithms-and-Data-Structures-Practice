/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package towersofhanoi;

/**
 *
 * @author Harshita V
 */
public class Towersofhanoi {

    /**
     * @param args the command line arguments
     */
    public static void toh(int n,String from,String to,String aux){
        if(n==1){System.out.println("move disk from"+from+"to"+to);}
        else{
         toh(n-1,from,aux,to);
         System.out.println("move disk from"+from+"to"+to);
         toh(n-1,aux,to,from);}
        
            }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3;
        String from="A";
        String to="C";
        String aux="B";
        toh(n,from,to,aux);
    }
    
}
