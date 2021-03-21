package coreJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class MyProperties {
    public static void writeProps(String propName) {
        Properties props= new Properties();
        props.setProperty("Name", "Chris");

        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(propName))){
            props.store(writer, "Chris's properties");
        }catch(Exception e){}
    }

    public static void readProps(String propName){
        Properties props= new Properties();
        props.setProperty("Name", "Chris");

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(propName))){
            props.load(reader);
            System.out.println(props.getProperty("Name"));
        }catch(Exception e){}
    }
}
