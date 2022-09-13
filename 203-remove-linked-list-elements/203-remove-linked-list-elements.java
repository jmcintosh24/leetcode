/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode dummyHead = new ListNode(0, curr);
        ListNode prev = null;
        
        while(curr != null) {
            if(curr.val == val) {
                if(prev == null && curr.next == null) {
                    dummyHead.next = null;
                } else if(prev == null) {
                    dummyHead.next = curr.next;
                } else if(curr.next == null) {
                    prev.next = null;
                } else {
                    prev.next = curr.next;
                }
            } else
                prev = curr;
            
            curr = curr.next;
        }
        
        return dummyHead.next;
    }
}