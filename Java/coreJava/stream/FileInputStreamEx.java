package coreJava.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx {
    public static void example(String fileName) throws IOException{
        File file =new File(fileName);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader= new InputStreamReader(in);
        BufferedReader bfIn= new BufferedReader(reader);
        String line;
       while((line = bfIn.readLine()) != null){
        System.out.println(line);
       }
       
       reader.close();
    //    int[] arr= new int[size];
    //    int i =0;
    //    //int data= in.read();
    //    while(in.available()> 0){
    //        arr[i]= in.read();
    //     i++;
    //    }
    //    in.close();
    //    for(int x: arr)
    //     System.out.print(x+" ");
    }
}
