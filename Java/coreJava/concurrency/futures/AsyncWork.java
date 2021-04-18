package coreJava.concurrency.futures;

import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* CompletableFuture<> it's just a better version of Future interface, infact it implements Future
* */
public class AsyncWork {

    //A private method that does async work in a new thread and returns a future
    private static Future<String> calculateAsync(String str) throws InterruptedException{
        CompletableFuture<String> completableFuture=new CompletableFuture<>();

        ExecutorService pool= Executors.newCachedThreadPool();

        pool.submit(()->{
            String nStr = str + (Math.random() * System.currentTimeMillis());
            Thread.sleep(500);
            completableFuture.complete(nStr);
            return null;
        });
        pool.shutdown();
        pool.awaitTermination(3,TimeUnit.SECONDS);
        return completableFuture;
    }

    //invokes the async work, waits for the result
    public static void simpleCompFuture(String str){
        try{
            Future<String> completableFuture= AsyncWork.calculateAsync(str);
            System.out.println(completableFuture.get());
        }
        catch (InterruptedException ie){
            System.out.printf("InterruptedException: %s",ie.getMessage());
        }
        catch (ExecutionException ee){
            System.out.printf("ExecutionException: %s",ee.getMessage());
        }
    }

    /*
    * Supplier is very general. It just "supplies a value" and that's it.
    * */
    public static void compFutureSupplyAsync(){
        CompletableFuture<Integer> future= CompletableFuture.supplyAsync(()->{
            try{
            Thread.sleep((int)(Math.random()*5000)+2000);
            }catch (InterruptedException e){}

            return (int)((Math.random()*5)+(Math.random()*5));
        });
        try {
            System.out.println(future.get());
        }
        catch (Exception e){}

    }

    /*
    * Runnable version with RunAsync method, does not return a value
    * but still using future's get() method to block and wait for result
    * */
    public static void compFutureRunAsync(){
        CompletableFuture<Void> future= CompletableFuture.runAsync(()->{
            try{
                Thread.sleep((int)(Math.random()*5000)+2000);
            }catch (InterruptedException e){}

            System.out.println((int)((Math.random()*5)+(Math.random()*5)));
        });
        try {
            future.get();
        }
        catch (Exception e){}

    }

    public static void chainingFuture(){
        CompletableFuture<Void> future= CompletableFuture.supplyAsync(()->"Chris")
                .thenApply((r)->r+" Mayol")
                .thenAccept((r)->System.out.printf("Computation returned: %s\n",r))
                .thenRun(()->System.out.println("Computation Finished"));

        //thenCombine(), combining multiple independent futures results and returning result
        //thenCombine(future,function(r1,r2)), takes another future and a function to process the results
        CompletableFuture<String> future2= CompletableFuture.supplyAsync(()->"cool")
                .thenCombine(CompletableFuture.supplyAsync(()->"nice"), (s1,s2)->s1+" "+s2);

        //thenAcceptBoth(), combining multiple futures results and no return
        CompletableFuture<Void> future3= CompletableFuture.supplyAsync(()->"async result 1")
                .thenAcceptBoth(CompletableFuture.supplyAsync(()->"async result 2"), (s1,s2)->System.out.println(s1+" and "+s2));
        /*
        thenApply()
        We can use this method to work with a result of the previous call. However,
        a key point to remember is that the return type will be combined of all calls.

        thenCompose() uses the previous stage as the argument.
        It will flatten and return a Future with the result directly, rather than a nested future.
        So if the idea is to chain CompletableFuture methods then it’s better to use thenCompose().
        * */
        CompletableFuture<String> future4= CompletableFuture.supplyAsync(()->"End")
                .thenCompose((r)->CompletableFuture.supplyAsync(()->r+" Game"))
                .thenApply((r)->r+"!");

        //waits for all futures to complete and then combine futures, but no result
        CompletableFuture<Void> combinedFutures= CompletableFuture.allOf(future,future3);

        //use stream api to get results of futures, CompletableFuture.join() is same as get() but throws exception
        String combined= Stream.of(future2,future4)
                .map(CompletableFuture::join)
                .collect(Collectors.joining("\n"));
        try {
            //future.get();
            //future3.get();
            combinedFutures.get();
            System.out.println(combined);
        }catch(Exception e){ }
    }
}
