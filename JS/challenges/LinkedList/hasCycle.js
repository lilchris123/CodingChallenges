/* LinkedList Cycle
Given head, the head of a linked list, determine if the linked list has a cycle in it.
*/
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let slow=head;
    let fast=head;
    
    while(slow && fast && fast.next){
        fast=fast.next.next;
        if(slow ==fast)
            return true;
        slow=slow.next;
    }
    return false;
};