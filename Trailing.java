/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trailing;

/**
 *
 * @author Harshita V
 */
public class Trailing {

    /**
     * @param args the command line arguments
     */
    public static int trailing(int n){
        int count=0;
        for(int i=5;n/i>0;i*=5){
        count+=n/i;
        }
    return count;}
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(trailing(10));
    }
    
}
