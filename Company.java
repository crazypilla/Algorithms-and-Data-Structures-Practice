/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author Harshita V
 */

abstract class Employee{
    int empId; String name; Date dob;
    
    Employee(int id,String name,Date dob){
    
    this.dob=dob;
    this.name=name;
    this.empId=id;}
abstract double computeSalary();
String getName(){return this.name;}
void setName(String newname){this.name=newname;}

public int getAge() {
    int years;
        years = -(dob.getYear())+((new Date().getYear()));
    return years;
}


}

class Daily extends Employee{ 
    Daily(int id,String name,Date dob){super(id,name,dob);}
    double computeSalary(){
    return 100;}
}

class Monthly extends Employee{ 
    int salperday;
    Monthly(int id,String name,Date dob,int salperday){super(id,name,dob); this.salperday=salperday;}
    double computeSalary(){
    return salperday*30;}
}
class Yearly extends Employee{ 
    int salpermonth;
    Yearly(int id,String name,Date dob,int salpermonth){super(id,name,dob);this.salpermonth=salpermonth;}
    double computeSalary(){
    return salpermonth*12;}
}


public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        for(int i=0;i<1;i++)
        
        {
            System.out.println("Enter the type of employee");
           // }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=(br.readLine());     
        if(s.equals("Daily")){
         Daily d=new Daily(1,"kittu",new Date(01/03/1989));
         System.out.println(d.computeSalary());
         System.out.println(d.getName());
         d.setName("krishna");
         System.out.println(d.getAge());
        }
        else if(s.equals("Monthly")){
        Monthly m=new Monthly(2,"hari",new Date(01/02/1987),110);
         System.out.println(m.computeSalary());
         System.out.println(new Date().getYear()+1900);
        }
        else{
        Yearly y=new Yearly(3,"honey",new Date(01/02/1993),40000);
         System.out.println(y.computeSalary());
        }
    }
    
}
}
