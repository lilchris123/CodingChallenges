package coreJava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Serialization {

    public static void serialization(Employee emp){
        String filename = "files/EmployeeObj.txt";

        try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)))){
            //FileOutputStream file=new FileOutputStream(new File(filename));
            //ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(emp);
            out.close();
            //file.close();
            System.out.println("Serialization complete");
        }
        catch(Exception e){
            System.out.println("Serialization error occurred");
        }
    }

    public static Employee deserialization(){
        Employee emp;
        String filename = "files/EmployeeObj.txt";
        
        try(ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get(filename)))){
            //FileInputStream file = new FileInputStream(new File(filename));
            //ObjectInputStream input = new ObjectInputStream(file);
            emp = (Employee)input.readObject();
            input.close();
            //file.close();
            System.out.println("Deserialization complete");
            System.out.println(emp);
        }
        catch(Exception e){
            System.out.println("Deserialization error occurred");
            emp = new Employee("",0);
        }
        return emp;
    }
}
