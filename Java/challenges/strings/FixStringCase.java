package challenges.strings;

public class FixStringCase {
    
    public static String fixStringCase(final String str) {
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isUpperCase(letter))
                upperCount++;
            else if(Character.isLowerCase(letter))
                lowerCount++;
        }
        return (lowerCount >= upperCount) ? str.toLowerCase(): str.toUpperCase();
    }
}