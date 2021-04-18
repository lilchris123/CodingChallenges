package coreJava.concurrency;

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class MyRunnableThread implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Threads {
    //MyThread is a class extending Thread class
    public static void NormalThread(){
        MyThread t1= new MyThread();
        t1.setName("Normal Thread");
        t1.start();

    }
    // MyRunnableThread is a class implementing Runnable
    public static void RunnableThread(){
        Thread tr= new Thread(new MyRunnableThread());
        tr.setName("Runnable Thread");
        tr.start();

    }
    //We define the interface and create an instance of it
    public static void AnonymousInterface(){
        Thread tr= new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        });

        tr.setName("Anonymous Interface Thread");
        tr.start();
    }
    //lambda defines the functional interface in our case its Runnable's run() functional interface method
    public static void lambdaThread(){
        Thread tr= new Thread(()-> System.out.println(Thread.currentThread().getName()));
        tr.setName("lambda Thread");
        tr.start();
    }
}
