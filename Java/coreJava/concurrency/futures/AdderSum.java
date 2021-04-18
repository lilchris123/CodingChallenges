package coreJava.concurrency.futures;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class AdderSum implements Callable<Integer> {
    private final String inFile;

    AdderSum(String inFile){
        this.inFile=inFile;
    }
    private int doAdd() throws IOException{
            Scanner reader= new Scanner(Paths.get(inFile));

            int sum= 0;

            while(reader.hasNextInt()){
                sum+= reader.nextInt();
            }
            reader.close();
            return sum;
    }

    @Override
    public Integer call() throws IOException{
        return doAdd();
    }
}
