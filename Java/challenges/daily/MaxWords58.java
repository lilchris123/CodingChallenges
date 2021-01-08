/*
Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less. 
You must break it up so that words don't break across lines. 
Each line has to have the maximum possible amount of words. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, 
you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. 
No string in the list has a length of more than 10.
*/
package challenges.daily;
import java.util.*;

public class MaxWords58 {

    //O(n)
    public static List<String> solution1(String s, int k){
        //split all the words
        String[] words= s.split(" ");
        //contains our results
        List<String> result= new ArrayList<>();

        String currLine= "";

        for(String word: words){
            //word > k, is not breakable
            if(word.length() > k)
                return new ArrayList<String>();

            //currLine + current word > k, add line to results and set our currLine with word
            else if(currLine.length() + word.length() > k){
                result.add(currLine);
                currLine= word;
            }
            //case currLine empty dont add a " "
            else if(currLine.length() ==0)
                currLine = word;
            else
                currLine+=" "+ word;
        }

        if(currLine.length() > 0)
            result.add(currLine);

        return result;
    }
}
