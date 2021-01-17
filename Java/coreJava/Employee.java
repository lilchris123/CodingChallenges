package coreJava;
import java.io.Serializable;
import java.util.UUID;

public class Employee implements Comparable<Employee>, Cloneable, Serializable{
    
    private static final long serialVersionUID = -5608729411558453056L;
    private UUID id;
    private String name;
    private int salary;
    private transient long SSN;          // transient field won't be serialized

    public Employee(String name, int salary){
        this.id= UUID.randomUUID();
        this.name=name;
        this.salary=salary;
        this.SSN=0;
    }
    //By default employees are compared by salaries
    public int compareTo(Employee emp){
        return this.getSalary() > emp.getSalary() ? 1 : -1; 
    }
    //returns a clone of this Employee object
    public Employee clone() throws CloneNotSupportedException{
        return (Employee)super.clone();
    }
    //toString output string
    public String toString(){
        return this.getId()+" "+this.getSSN()+" "+this.getName()+" "+this.getSalary()+"\n";
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
    public long getSSN() {
        return SSN;
    }
    public void setSSN(long sSN) {
        SSN = sSN;
    }

}
