/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearsearh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Harshita V
 */
public class LinearSearh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int arr[]={1,2,3,5,12,2,6,34,11};
        int n=arr.length;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=Integer.parseInt(br.readLine());
        
        
        boolean flag = false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
             {
        
                flag=true;
                break;
             }
             else
             {flag=false;
              }
         }
         if(flag==true){System.out.println("I found it!!");}
    else{System.out.println("sorry");}
    }
}
