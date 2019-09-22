import java.util.*;

class CollectionExample{

    public static void main(String[] args){

        Set<Integer> set= new TreeSet<Integer>();
        //set.add(null);
        set.add(4);
        set.add(2);
        //set.add(null);
        System.out.println(set);

        List<Integer> list= new ArrayList<Integer>(set);
        System.out.println(list);

        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"dog");

        System.out.println(map.get(1));
    }
}