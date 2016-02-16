/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airreservation;

import java.util.Scanner;

/**
 *
 * @author Harshita V
 */
public class AirReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f=0;
        int exit=1;
        int e=0,count=0;
        do
        {
        Scanner input=new Scanner(System.in);
        System.out.println("enter which class you want to book: 1.firstclass 2:economy 3.exit");
        int c_choosen=input.nextInt();
        switch(c_choosen)
        {
            case 1:
                System.out.println("you chose first class");
                if(f<5)
                { f++;
                         count++;
                    System.out.println("you got   "+f+"  seat reserved in first class");
                }
                else if(count<10)
                {System.out.println("Sorry seats are full in first class !choose 1 to go to main menu to economy class"); exit=1;}
                
                
                else
                {System.out.println("sorry flight is full, next flight is in 3 hours");exit=0;}
            
                break;
            case 2:
                System.out.println("you chose economy");
                 if(e<5)
                 { e++;
                   count++;
                    System.out.println("you got   "+e+"  seat reserved in economy class");
                }
                 else if(count<10)
                 {System.out.println("Sorry seats are full in economy class !choose 1 to go to main menu to book first class"); exit=1;}
                
                 
                 
                 else
                 {System.out.println("Sorry seats are all full.next flight in 3 hours ");
                  exit=0;
                 }
              break;
            case 3: System.out.println("exitting..see you soon!");
                break;
           }
        }while(exit==1);
        
        System.out.println("thanks for visiting");
        }
}
        
    
    

