package coreJava;

import java.util.UUID;

public class Employee implements Comparable<Employee>, Cloneable{
    private UUID id;
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.id= UUID.randomUUID();
        this.name=name;
        this.salary=salary;
    }
    //By default employees are compared by salaries
    public int compareTo(Employee emp){
        return this.getSalary() > emp.getSalary() ? 1 : -1; 
    }
    //clones another employee
    public Employee clone() throws CloneNotSupportedException{
        return (Employee)super.clone();
    }
    //toString output string
    public String toString(){
        return this.getId()+" "+this.getName()+" "+this.getSalary()+"\n";
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
