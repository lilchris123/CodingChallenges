package coreJava.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompExecutorSer {
    public static void ex(){
        final int NUM_IO_OPS=100;
        //ExecutorService es= Executors.newFixedThreadPool(10);

        //limits TaskQueue by blocking incoming submitted taskes if queue is full
        //ExecutorService es= new ThreadPoolExecutor(20,20,0L,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(20),new ThreadPoolExecutor.CallerRunsPolicy());
        ExecutorService es= Executors.newFixedThreadPool(10);
        CompletionService completionService= new ExecutorCompletionService(es);

        for(int i=0; i< NUM_IO_OPS; i++){
            completionService.submit(()->{
                Thread.sleep(2000);
                return 1;
            });
        }

        int cnt=0;
        int sum=0;
        while(cnt < NUM_IO_OPS){
            try{
                Future<Integer> future= completionService.take();
                cnt++;
                sum+= future.get();
            }catch(Exception e){

            }
        }
        System.out.println("SUM: "+sum);
        try{
            es.shutdown();
            es.awaitTermination(3,TimeUnit.SECONDS);
        }catch(Exception e){

        }
    }
}
