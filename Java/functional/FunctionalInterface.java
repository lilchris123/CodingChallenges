package functional;

//A simple functional interface for adding function
interface AddInterface {

     int add(int num1, int num2);
}

public class FunctionalInterface{
    //define add functional interface by implementing it with annonymous class
    public static void AddAnonClass(){
        AddInterface in = new AddInterface(){
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        System.out.println(in.add(10,10));
    }
    //lambda expression to define functional interface
    public static void AddLambda(){
        AddInterface in = (a,b)->a+b;

        System.out.println(in.add(5,5));
    }

}