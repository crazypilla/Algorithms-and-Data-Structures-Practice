package serializabledemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Harshita V
 */
class Dog implements Serializable{
    int i=10;
    int j=20;
}
public class SerializableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Dog d1=new Dog();
        FileOutputStream fos=new FileOutputStream("amrita.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println(d1.i+""+d1.j);
        try{
        FileInputStream fis=new FileInputStream("amrita.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println(d2.i+" "+d2.j);
        }
        catch(Exception e){}
        }
    }
    

