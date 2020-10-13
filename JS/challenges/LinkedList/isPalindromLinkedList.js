//O(n) Space: O(n) using stack
var isPalindrome = function(head) {
    let stack= [];
    let curr=head;
    while(curr){
        stack.push(curr.val);
        curr=curr.next;
    }
    curr=head;
    while(curr){
        if(stack && stack.pop() != curr.val)
            return false;
        curr=curr.next;
    }
    return true;
};