package coreJava;

import java.util.*;
import java.util.stream.Collectors;
class Employee{
    int Salary;
    UUID ID;
    String Name;
    Employee(String name, int salary){
        this.Name= name;
        this.Salary=salary;
        this.ID= UUID.randomUUID();
    }
}
public class WorkingWithStreams{
    public static void Example(){
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

    public static void grouping(){
        List<Employee> list= new ArrayList<>();
        list.add(new Employee("Chris", 85000));
        list.add(new Employee("Donny", 90000));
        list.add(new Employee("Roy", 82000));
        list.add(new Employee("Stanley", 85000));

        Map<Integer,List<Employee>> result;
        result = list.stream().collect(Collectors.groupingBy(e-> e.Salary));

        for(Map.Entry<Integer,List<Employee>> e: result.entrySet()){
            System.out.print("Salary: "+e.getKey()+" ");
            e.getValue().forEach(emp -> System.out.print(emp.Name+" "));
            System.out.println();
        }
    }
}