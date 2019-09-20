//write a program that checks if a number is prime or not
class Prime{

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        if(isPrime(27))
            System.out.println("Is prime");
        else
        System.out.println("not prime");
    }
}