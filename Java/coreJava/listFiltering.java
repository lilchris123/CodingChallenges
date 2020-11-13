package coreJava;

import java.util.*;
import java.util.stream.Collectors;

public class listFiltering {
    public static void filterList(Integer list[]){
        List<Integer> l=new LinkedList<Integer>();
        for (Integer num : list)
            l.add(num);
        System.out.println(
        l.stream().filter((item) -> item < 10).collect(Collectors.toList())
        );
    }
    public static void main(String[] args) {
        Integer arr[]={5,55,11,3,6};
        filterList(arr);
    }
}