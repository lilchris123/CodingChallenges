package coreJava;
import java.util.*;

public class Sorting {
    public static void sortingStrings(){
        String word ="sdflajal";
        char[] sorted = word.toCharArray();
        Arrays.sort(sorted);
        System.out.printf("%s",new String(sorted));
    }
    public static void sortingEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("chris", 85000));
        employees.add(new Employee("donelys", 95000));
        employees.add(new Employee("stanley", 87000));

        //Employee object will be sorted by salaries by default 
        System.out.println("Sorting by salaries (Natural Order)");
        Collections.sort(employees);
        for(Employee emp: employees)
            System.out.print(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+"\n");
        System.out.println();

        //Sort by IDs using comparator functional interface via lambda expression
        System.out.println("Sorting by IDs");
        Collections.sort(employees, (a,b)-> a.getId().compareTo(b.getId()));
        for(Employee emp: employees)
            System.out.print(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+"\n");
        System.out.println();

        //Sort by names using stream and sort function passing in and implementing comparator function
        System.out.println("Sorting by names");
        employees.stream().sorted((e1,e2)-> e1.getName().compareTo(e2.getName()))
        .forEach(emp->System.out.print(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+"\n"));
    }
}
