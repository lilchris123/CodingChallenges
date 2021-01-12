package challenges.strings;
/* Second Goldman sacs interview problem
 Find the shortest distance between the center of two words in a sentence

 sentence: "I love cat and dogs"
 word1: "cat"   center position is 'a' position 1
 word2: "and"   center position is 'n' position 1
 output: 4d

 word1: "cat"   center position is 'n' position 1
 word2: "dogs"  center position is between "og" position 1.5, since center is in the middle of 2 positions
 output: 8.5d
*/
public class wordDistance {

    public static String distance(String sentence, String word1, String word2){
        String[] words= sentence.split(" ");
        int index=0;
        double word1Loc=0;
        double word2Loc=sentence.length();

        double current= sentence.length();
        double shortest= sentence.length();

        for(String w: words){
            if(w.equals(word1)){
                word1Loc= index + (w.length() > 1 ? w.length()-1: w.length()) /2.0;
                // System.out.println("word1 idx: "+ index);
                // System.out.println("center position: "+(w.length() > 1 ? w.length()-1: w.length()) /2.0);
                // System.out.println("center postion location: "+word1Loc);
            }
            else if(w.equals(word2)){
                word2Loc= index + (w.length() > 1 ? w.length()-1: w.length()) /2.0;
                // System.out.println("word2 idx: "+ index);
                // System.out.println("center position: "+(w.length() > 1 ? w.length()-1: w.length()) /2.0);
                // System.out.println("center postion location: "+word2Loc);
            }
            //System.out.println(current);
            current= word2Loc - word1Loc;
            shortest= Math.min(shortest,current);
            //System.out.println(shortest);

            index += w.length()+1;
        }
        return shortest+"d";
    }
    
}
