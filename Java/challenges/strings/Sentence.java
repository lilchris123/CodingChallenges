package challenges.strings;

public class Sentence {
    public static String Capitilize(String sen){
       String result="";
       String[] words= sen.split(" ");

       for(String word: words){
           char c= word.charAt(0);
           if(Character.isLowerCase(c)){
            word= Character.toUpperCase(c)+ word.substring(1);
           }
           result+= word+" ";
       }
       return result.trim();
    }
}
