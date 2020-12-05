package challenges.daily;

import java.util.*;

public class Problem16 {
    private List<Integer> log;

    Problem16(){
        log= new ArrayList<>();
    }
    //adds order_id to log
    public void record(int order_id){
        log.add(order_id);
    }
    public int get_last(int index){
        return log.get(index);
    }
}
