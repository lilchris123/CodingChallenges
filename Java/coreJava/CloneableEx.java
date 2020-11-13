package coreJava;

class A implements Cloneable {
    int i,j;
    A(){}
    A(int i, int j){
        this.i=i;
        this.j=j;
    }
   
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class CloneableEx{
    
    public static void cloneableEx() throws CloneNotSupportedException{
        A a= new A(5,10);
        A b= new A();
        b=(A)a.clone();
        b.j=15;
        System.out.println(a.i+" "+a.j);
        System.out.println(b.i+" "+b.j);
    }
}