/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generateprimes;

/**
 *
 * @author Harshita V
 */
public class Generateprimes {

    /**
     * @param args the command line arguments
     */
    public static void generateprimes(int n){
    
    System.out.println(2+"  "+3);
    //for(int j=)
    for(int i=5;i<=n;i=i+2){ 
        //System.out.println("**"); 
        boolean check=true;
       for(int j=2;j<=Math.sqrt(i);j++)
                { //System.out.println("**");
                     if(i%j==0){  check=false;
                         break;
                                 }

                }
           if(check==true){System.out.println(i);}
        }
        }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        generateprimes(30);
    }
    
}
