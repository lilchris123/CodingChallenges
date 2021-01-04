package challenges.math;

public class DifferByOne {

    public static void differByOne(int n){
        for(int i=1; i<= n; i++){
            if(differByOneLogic(i))
                System.out.print(i+" ");
        }
    }

    public static boolean differByOneLogic(int n){

        //digits are looked from the right hand side
        while(n >= 10){
            int firstDigit = n%10;
            n/=10;
            int secondDigit = n%10;

            if( Math.abs(firstDigit - secondDigit) != 1)
                return false;
        }

        return true;
    }
}