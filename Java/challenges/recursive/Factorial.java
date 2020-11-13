package challenges.recursive;

public class Factorial{
    public static int fact(int num){
        if(num<2)
            return num;
        return num * fact(num-1);
    }
}