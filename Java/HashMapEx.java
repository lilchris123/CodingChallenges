import java.util.*;

class HashMapEx{

    public static void main(String[] args){

        //Declare a map collection interface, which extends the collection interface
        //Key, Value pair structure
        Map<String,Integer> hmap;
        
        //Give it a instance of the HashMap Collection Class
        //Key, Value pair HashTable structure
        hmap= new HashMap<String,Integer>();

        //add data
        hmap.put(null,5);
        hmap.put(null, 8);
        hmap.put("orange", 7);
        hmap.put("apple",null);
        hmap.put("grape", 10);

        //Print out our HashMap
        System.out.println("Our HashMap:");
        System.out.println(hmap+ "\n");
        
        //Print all the keys of the HashMap
        System.out.println("Keys:");
        System.out.println(hmap.keySet()+ "\n");

        //Print all the values in our HashMap
        System.out.println("Values:");
        System.out.println(hmap.values()+ "\n");

        //Check if a key exist
        String key="grape";
        System.out.println("Does "+key+" exist? \n"+hmap.containsKey(key)+ "\n");

        //Print the value of a key
        key="apple";
        System.out.println("Value of "+key+':');
        System.out.println(hmap.get(key)+ "\n");
    }
}