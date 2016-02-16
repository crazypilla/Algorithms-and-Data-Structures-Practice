/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package islucky;

/**
 *
 * @author Harshita V
 */
public class Islucky {

    /**
     * @param args the command line arguments
     */
    static int islucky(int n){
    int ctr=2;
    if(ctr>n)
    {return 1;}
    if(n%ctr==0)
    {return 0;}
    n-=n/ctr;
    ctr++;
    return islucky(n);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(islucky(19));
    }
    
}
