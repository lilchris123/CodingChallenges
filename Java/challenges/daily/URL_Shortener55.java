package challenges.daily;
import java.util.*;

public class URL_Shortener55 {
    //store our urls with there short urls
    static Map<String,String> lookup= new HashMap<>();

    //generate a new shortened url
    static String generateShortURL(List<Character> chars){
        String shortURL="";
        for(int i=0; i<6; i++){
            int pos = (int)(Math.random() * chars.size());
           shortURL+= ""+ chars.get(pos);
        }
        return shortURL;
    }

    public static String shorten(String url){
        List<Character> chars= new ArrayList<>();
        char c= 'A';
        while(c >= 'A' && c <= 'Z'){
            chars.add(c);
            c++;
        }
        c= 'a';
        while(c >= 'a' && c <= 'z'){
            chars.add(c);
            c++;
        }
        c= '0';
        while(c >= '0' && c <= '9'){
            chars.add(c);
            c++;
        }
        
        String shortURL="";
        while(shortURL.length() == 0){
            String generated = generateShortURL(chars);
            if(!lookup.containsKey(generated))
                shortURL= generated;
        }
        
        lookup.put(shortURL,url);
        return shortURL;
    }

    public static String restore(String shortURL){
        return lookup.get(shortURL);
    }

}
