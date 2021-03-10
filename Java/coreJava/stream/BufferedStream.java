package coreJava.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BufferedStream {
    //Writing with line breaks
    public static void writeData(String[] data) throws IOException {
        try(BufferedWriter bw= new BufferedWriter(new FileWriter("file.txt"))){
            for(String d:data){
                bw.write(d);
                bw.newLine();
            }
        }
    }
    //Reading lines
    public static void readData() throws IOException {
        try(BufferedReader br= new BufferedReader(new FileReader("file.txt"))){
           String inValue;
           while((inValue=br.readLine())!=null){
               System.out.println(inValue);
           }
        }
    }
    //Read All lines
    public static void readThemAll()throws IOException{
        List<String> lines= Files.readAllLines(Paths.get("file.txt"));

        for(String line: lines)
            System.out.println(line);
    }
}
