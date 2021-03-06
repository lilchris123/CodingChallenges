package challenges.strings;
//In this Kata, we are going to reverse a string while maintaining the spaces (if any) in their original place.

public class StringReversal{
    static void swap(StringBuilder str, int a, int b) {
        char temp = str.charAt(a);
        str.setCharAt(a, str.charAt(b));
        str.setCharAt(b, temp);
    }

    public static String strReversal(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder str = new StringBuilder(s);
        while (l < r) {
            if (str.charAt(l) == ' ')
                l++;
            else if (str.charAt(r) == ' ')
                r--;
            else {
                swap(str, l, r);
                l++;
                r--;
            }
        }
        return str.toString();
    }
}