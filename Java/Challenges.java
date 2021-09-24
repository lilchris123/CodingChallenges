import coreJava.Employee;
import coreJava.concurrency.CompExecutorSer;
import coreJava.concurrency.futures.AsyncWork;
import coreJava.type_reflection.MethodAccessReflection;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

public class Challenges {
    public static void main(String[] args){
        //CompExecutorSer.ex();
        System.out.println("The stream after applying "
                           + "the function is : ");
  
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
  
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);

        System.out.println(list);
    } 
    

}