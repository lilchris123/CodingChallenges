var removeElements = function(head, val) {
  
    while(head != null && head.val==val)
        head=head.next;
    
    let curr= head;
    
    while(curr && curr.next){
        if(curr.next.val == val){
            curr.next= curr.next.next;  
        }
        else
            curr=curr.next;
    }
    return head;
};

//recursive
function removeElements(head,val) {
    if (head == null) return null;
    head.next = removeElements(head.next, val);
    return head.val == val ? head.next : head;
}