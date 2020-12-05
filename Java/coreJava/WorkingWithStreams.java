package coreJava;

import java.util.*;
import java.util.stream.Collectors;

public class WorkingWithStreams{
    public static void references(){
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(7);

        System.out.println("list: \n"+list);

        //Sort list ascending order
        List<Integer> sortedList;
        sortedList = list.stream().sorted((a,b)-> a-b).collect(Collectors.toList());
        System.out.println("\nlist asceding order: \n"+sortedList);

        //Sort list descending order
        List<Integer> descendingList;
        descendingList = list.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
        System.out.println("\nlist descending order: \n"+descendingList);

        //Reduced the list to one value (the sum)
        Integer sum;
        sum = list.stream().reduce(0, (a,b)-> a+b);
        System.out.println("\nlist reduced to sum: \n"+sum);

        //convert list to map using collectors
        Map<Integer,Integer> m;
        m = list.stream().map(e -> e).collect(Collectors.toMap((k) -> k, (v) -> v*2));
        System.out.println("\nConverted to Map and valued doubled: \n"+ m);

        //convert list to set using collectors
        list.add(5);
        list.add(7);
        
        System.out.println("\nlist: \n"+list);
        Set<Integer> s;
        s = list.stream().map(e -> e).collect(Collectors.toSet());
        System.out.println("\nConverted to Set: \n"+ s);
    }
}