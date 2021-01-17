package coreJava;

import java.io.*;

public class Serialization {

    public static void serialization(Employee emp){
        String filename = "EmployeeObj.txt";

        try{
            FileOutputStream file=new FileOutputStream(new File(filename));
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(emp);
            out.close();
            file.close();
            System.out.println("Serialization complete");
        }
        catch(Exception e){
            System.out.println("Serialization error occurred");
        }
    }

    public static Employee deserialization(){
        Employee emp;
        String filename = "EmployeeObj.txt";
        
        try{
            FileInputStream file = new FileInputStream(new File(filename));
            ObjectInputStream input = new ObjectInputStream(file);
            emp = (Employee)input.readObject();
            input.close();
            file.close();
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
