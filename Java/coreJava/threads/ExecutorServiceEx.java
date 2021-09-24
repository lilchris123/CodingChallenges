package coreJava.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
* ExecuterService
*   -Abstract thread management details
*   -Can interact with thread pools
* */
public class ExecutorServiceEx {

    public static void example(){
        String[] inFiles={"files/in_numbers1.txt","files/in_numbers2.txt"};
        String[] outFiles={"files/out_numbers1.txt","files/out_numbers2.txt"};

        ExecutorService es = Executors.newFixedThreadPool(2);
        for(int i=0; i< inFiles.length; i++){
            es.submit(new Adder(inFiles[i],outFiles[i]));
        }
        try{
        es.shutdown();
        es.awaitTermination(5, TimeUnit.SECONDS);
        }catch (Exception e){System.out.println(e.getMessage());}
    }
}
