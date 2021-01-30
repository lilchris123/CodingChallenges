package challenges.strings;

public class DecodeString {
    public static String decodeString(String s) {
        //keep track of curr index
        int[] idx = {0}; 
        return decode(s, idx);
    }
    
    static String decode(String s, int[] idx){
        StringBuilder sb = new StringBuilder();
        int num = 0;
        
        while(idx[0] < s.length()){
            char ch = s.charAt(idx[0]);
            idx[0]++; 
            
            if(Character.isDigit(ch)){
                // if curr char is a number, store it
                num = num * 10+ (ch -'0'); 
            }
            else if(ch == '['){
                // start recursion to solve sub problem. Returns the string between [ and ].
                String innerStr = decode(s, idx); 
                while(num > 0){
                    // multiply returned string with the num. 
                    sb.append(innerStr); 
                    num--; // num resets to 0.
                }
            }
            else if(ch == ']'){ 
                // At this point, we're finishing up a recursive call. 
                break;  // break from the sub call and return innerString.
            }
            
            else{
                // appends any extra characters that do not need multiplying Ex: abc2[a],a2[b]a 
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
