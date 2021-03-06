package coreJava;
import java.util.*;

class CollectionExample{

    public static void collectionEx(){
        Stack<Integer> stack= new Stack<>();
        stack.add(5);
        stack.add(4);

        Queue<Integer> queue= new LinkedList<>();
        queue.add(4);
        queue.poll();

        Deque<Integer> deque= new LinkedList<>();
        deque.add(5);
        deque.add(9);
        deque.poll();
        deque.pop();
    
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

        Integer arr[]={5,5,9,2,4};

        new ArrayList<Integer>(Arrays.asList(arr)).stream().distinct().forEach(item -> System.out.print(item));
    }
}