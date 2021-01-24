package challenges.daily;
import challenges.dataStructures.linkedlists.Node;

public class ReverseLinkedList73 {
    //                        p    cn        p    cn
    //null -> 1 -> 2 ->  3 -> 4
    //null <- 1 <- 2 <-  3 <- 4
    // curr=1
    public static Node sol1(Node head){
        Node prev=null;
        Node curr= head;
        Node next = curr;

        while(next != null){
            next=curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;
        }
        head =prev;
        return head;
    }
}
