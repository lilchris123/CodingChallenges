package challenges.strings;

public class SumOfString {
    //O(n) try catch not number exception
    public static long sumOfString(String str){
        long sum = 0;
        long currNum=0;

        for(int i=0; i<str.length(); i++){
            try{
                int num= Integer.parseInt("" + str.charAt(i));
                if(currNum > 0){
                    currNum= currNum *10 + num;
                }
                else 
                    currNum+= num;
             }
             catch(Exception e){
                 sum += currNum;
                 currNum = 0;
             }
        }
        sum += currNum;

        return sum;
    }
    //O(n) isDigit()
    public static long sumOfString2(String str){
        long sum = 0;
        long currNum=0;

        for(int i=0; i<str.length(); i++){

            if(Character.isDigit(str.charAt(i))){
                int num= Integer.parseInt("" + str.charAt(i));

                if(currNum > 0)
                    currNum= currNum *10 + num;
                    
                else 
                    currNum+= num;
             }
             else{
                 sum += currNum;
                 currNum = 0;
             }
        }
        sum += currNum;

        return sum;
    }
    
}
