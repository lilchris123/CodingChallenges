package coreJava.threads;

public class AddingFiles {
    public static void addExample(){
        String[] inFiles={"files/in_numbers1.txt","files/in_numbers2.txt"};
        String[] outFiles={"files/out_numbers1.txt","files/out_numbers2.txt"};
        Thread[] threads= new Thread[inFiles.length];
        for(int i=0; i<inFiles.length; i++){
            threads[i]= new Thread(new Adder(inFiles[i],outFiles[i]));
            threads[i].start();
        }

        for(Thread t: threads) {
            try {
                t.join();
            }catch (InterruptedException e){System.out.println(e.getMessage());}
        }
    }
}
