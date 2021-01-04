package challenges.daily;
import java.util.*;

/**
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, 
return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
 */

public class Autocomplete11 {
    public static List<String> problem11(List<String> wordBank, String prefix){
        List<String> result= new ArrayList<>();
        for(String word : wordBank){
            if(word.startsWith(prefix))
                result.add(word);
        }
        return result;
    }
}