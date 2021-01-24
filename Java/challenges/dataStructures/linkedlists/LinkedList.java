package challenges.dataStructures.linkedlists;

public class LinkedList {
    public Node head;
    public LinkedList(int val){
        this.head= new Node(val);
    }
    public void add(int val){
        Node newNode=new Node(val);
        if (head == null){
            head= newNode;
            return;
        }
        Node curr= this.head;
        while(curr.next !=null) 
            curr=curr.next;
    
        curr.next= newNode;
    }

    public void printList(){
        Node curr=this.head;
        while(curr!= null){
            if(curr.next != null)
                System.out.print(curr.val+" -> ");
            else
                System.out.print(curr.val);
            curr=curr.next;
        }
    }
}
