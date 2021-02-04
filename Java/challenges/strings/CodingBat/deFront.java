package challenges.strings.CodingBat;
/*
'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/
public class deFront {
    public static String deFront(String str) {
        if(str.length()==0) return str;
        
        if(str.charAt(0) == 'a' && str.charAt(1) == 'b')
          return str;
        
        if(str.charAt(0) == 'a')
          return 'a'+ str.substring(2);
          
        if(str.charAt(1) == 'b')
          return str.substring(1);
      
        return str.substring(2);
      }
}
