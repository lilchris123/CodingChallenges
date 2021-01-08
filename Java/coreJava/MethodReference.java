package coreJava;
import java.util.*;

public class MethodReference {
    static void Example(){

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);

        list.stream().forEach(System.out::println);

    
    }
}
