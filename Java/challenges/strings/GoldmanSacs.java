package challenges.strings;
import java.util.*;

public class GoldmanSacs {

    static String Max(Map<String,Integer> m){
        Map.Entry<String,Integer> result= Map.entry("default", Integer.MIN_VALUE);

        for(Map.Entry<String,Integer> entry : m.entrySet()){
            if(entry.getValue() > result.getValue())
                result= entry;
        }
        return result.getKey();
    }
    
    public static String findMostIp(String[] lines){

        Map<String,Integer> m= new HashMap<>();

        for(String line : lines){
            String ip= line.split(" ")[0];
            if(!m.containsKey(ip)){
                m.put(ip,1);
            }
            else
                m.put(ip,m.get(ip)+ 1);
        }

        //String result= Collections.max(m.entrySet(), (a,b) -> a.getValue()+b.getValue()).getKey();
        //String result = m.entrySet().stream().max((a,b) -> a.getValue() - b.getValue()).get().getKey();
        
        return Max(m);
    } 
}
