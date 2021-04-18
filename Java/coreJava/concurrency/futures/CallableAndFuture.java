package coreJava.concurrency.futures;

import coreJava.concurrency.futures.AdderSum;

import java.util.concurrent.*;

/*
* Callable Interface
* -Represents a task to be run on a thread (similar to Runnable)
* -Can return results
* -Can throw exceptions
*
* Future Interface
* - Represents results of a thread task
* -Can access results from task
* -Can throw exceptions from thread task
* */
public class CallableAndFuture {
    public static void ex1(){
        String[] inFiles={"files/in_numbers1.txt","files/in_numbers2.txt"};
        ExecutorService es= Executors.newFixedThreadPool(inFiles.length);
        Future<Integer>[] results= new Future[inFiles.length];

        for(int i=0; i<inFiles.length; i++){
            AdderSum adderSum= new AdderSum(inFiles[i]);
            results[i]= es.submit(adderSum);
        }

        int sum=0;
        for(Future<Integer> f: results){
            try {
                sum += f.get();
            }catch(ExecutionException ex){System.out.println(ex.getMessage());}
            catch (Exception e){System.out.println(e.getMessage());}
        }
        es.shutdown();
        System.out.printf("sum: %d",sum);
    }
}
