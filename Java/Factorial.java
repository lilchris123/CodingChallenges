class Factorial{
    static int fact(int num){
        if(num<2)
            return num;
        return num * fact(num-1);
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}