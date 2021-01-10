package coreJava;
// printArr method takes in and prints any type of array
public class GenericMethods {
    public static <T> void printArr(T[] arr){
        for(T x: arr)
         System.out.print(x+" ");
    }
}