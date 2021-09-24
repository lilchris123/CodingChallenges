package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

//A simple functional interface for adding function
interface AddInterface {

     int add(int num1, int num2);
}

public class FunctionalInterface{
    static Function<Integer,Integer> incFunc = (num)-> num++;
    static Function<Integer,Integer> decFunc= (num)-> num--;

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

    public static void functionalEx(){
        int numInc= incFunc.apply(5);
        int numDec= decFunc.apply(numInc);

        Function<Integer,Integer> incAndDec = incFunc.andThen(decFunc);
        System.out.println(incAndDec.apply(5));

        //BiFunction takes 2 arguments and produces 1 result
        BiFunction<Integer,Integer,Integer> incNMultiplyBy= (n1,n2) -> (n1++) * n2;
        System.out.println(incNMultiplyBy.apply(10, 10));
    }

}