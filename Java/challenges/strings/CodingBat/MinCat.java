package challenges.strings.CodingBat;
/*
Given two strings, append them together (known as "concatenation") 
and return the result. However, if the strings are different lengths, 
omit chars from the longer string so it is the same length as the shorter string. 
So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/
public class MinCat {
    public String minCat(String a, String b) {
        String res="";
        int aLn=a.length();
        int bLn=b.length();
        
        if(aLn > bLn)
          res= a.substring(aLn - bLn) +b;
          
        else if(aLn < bLn)
          res= a+ b.substring(bLn - aLn) ;
          
        else
          res= a+b;
          
        return res;
      }
      
}
