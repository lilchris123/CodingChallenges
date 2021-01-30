package challenges.strings.CodingBat;
/*
Given a string of any length, return a new string where the last 2 chars, 
if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/
public class LastTwoCB{
    public static String lastTwo(String str) {
        int n= str.length();
        
        if(n <2) return str;
        
        return str.substring(0,n-2)+ str.substring(n-1)+str.substring(n-2,n-1);
      }
}
