package challenges.strings;

public class StringShift {
    static void swap(StringBuilder sb, int a, int b){
        char temp= sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, temp);
    }
    static void shiftRight(StringBuilder sb, int k){
        while(k > 0){
            for(int i=0; i<sb.length(); i++){
                swap(sb,i,sb.length()-1);
            }
            k--;
        }
    }

    static void shiftLeft(StringBuilder sb, int k){
        while(k > 0){
            for(int i=sb.length()-1; i> 0; i--){
                swap(sb,i,0);
            }
            k--;
        }
    }

    public static String PerformStringShift(String s, int[][] shifts){
        StringBuilder sb= new StringBuilder(s);

        for(int[] shift: shifts){
            int k= shift[1] % sb.length();
            if(shift[0] == 0)
                shiftLeft(sb, k);
            else
                shiftRight(sb, k);
        }
        return sb.toString();
    }
    
}
