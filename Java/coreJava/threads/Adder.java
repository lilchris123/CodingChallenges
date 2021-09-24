package coreJava.threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Adder implements Runnable{
    private String inFile, outFile;
    Adder(String inFile, String outFile){
        this.inFile= inFile;
        this.outFile= outFile;
    }
    private void doWork(){
        try {
            //BufferedReader reader = Files.newBufferedReader(Paths.get(inFile));
            Scanner reader= new Scanner(Paths.get(inFile));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile));

            int sum=0;
//            String line;
//            while((line = reader.readLine()) != null){
//                for(String num: line.split(" "))
//                    sum+= Integer.parseInt(num);
//                System.out.printf("%d: curr sum %d\n",Thread.currentThread().getId(),sum);
//            }
            while(reader.hasNextInt()){
                sum+= reader.nextInt();
            }
            reader.close();
            writer.write(String.format("Sum: %d",sum));
            writer.close();
        }
        catch(IOException io){ System.out.println(io.getMessage());}
    }
    @Override
    public void run() {
        doWork();
    }
}
