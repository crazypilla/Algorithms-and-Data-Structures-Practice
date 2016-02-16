/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonenum;

/**
 *
 * @author Harshita V
 */
public class Phonenum {

    /**
     * @param args the command line arguments
     */
    public static void print(String res,String digits,int n){
    if(n==0){
    
    System.out.println(res);
    }
    for(int i=0;i<digits.length();++i){
    print(res+digits.charAt(i),digits.replace(String.valueOf(digits.charAt(i)),""), n-1);
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        print("","1234567890",2);
    }
    
}
