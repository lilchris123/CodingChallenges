package challenges.daily;
/*
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".


*/

import java.util.*;

public class Problem13 {
    //0(n) find number of distinct characters 
    static int distinctChars(String str){
        Set<Character> set= new HashSet<>();
    
        for(int i=0; i< str.length(); i++){
            char ch= str.charAt(i);
            set.add(ch);
        }
        return set.size();
    }
    //0(n^2) brute force approach - check all substrings, keeping track of the longest solution
    public static String longestDistinctSubString(String str, int k){
        String longest = "";

        for(int i=0; i< str.length(); i++){
            for(int j=i; j< str.length(); j++){

                String sub = str.substring(i, j);
                if(distinctChars(sub) == k && sub.length() > longest.length()) 
                    longest = sub;
            }
        }
        return longest;
    }
}