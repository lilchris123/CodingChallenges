package challenges.strings;
import java.util.*;

public class WordDictionary {
    //O(n)
    static List<String> max(List<String> words){
        List<String> longest= new ArrayList<>();
        int maxLen= 0;

        //1 pass to get word max Length
        for(String w: words)
            maxLen=Math.max(maxLen,w.length());

        //add all the words with max length to our results
        for(String w: words)
            if(maxLen <= w.length())
                longest.add(w);
        return longest;
    }

    //O(n^2)
    public static List<String> wordDictionary(String word, List<String> words){
        List<String> results= new ArrayList<>();
        
        for(String w: words){

            StringBuilder currSB= new StringBuilder(w);

            for(char c1: word.toCharArray()){
                for(int i=0; i<currSB.length(); i++){
                    if(c1 ==currSB.charAt(i)){
                        currSB.deleteCharAt(i);
                        break;
                    }
                }
            }
            if(currSB.length() ==0)
                results.add(w);
        }
        
        return max(results);
        
    }
}
