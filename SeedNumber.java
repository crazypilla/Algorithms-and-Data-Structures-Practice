/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seednumber;

/**
 *
 * @author Harshita V
 */
public class SeedNumber {

public static void printSeed(int n){

for(int i=0;i<n;i++){
String numstr=Integer.toString(i);
int prod=i;
for(int j=0;j<numstr.length();j++){
int p=numstr.charAt(j)-'0';

prod=prod*p;
}

if(prod==n)
System.out.println(i);
}
}


public static void main(String[] args) {
int n=488;
printSeed(n);

}

}
