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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2 = list2;
        
        ListNode head = new ListNode();
        ListNode curr = head;
        
        while(n1 != null || n2 != null) {
            if(n1 == null) {
                curr.next = n2;
                n2 = n2.next;
            } else if (n2 == null) {
                curr.next = n1;
                n1 = n1.next;
            } else {
                if(n1.val < n2.val) {
                    curr.next = n1;
                    n1 = n1.next;
                } else {
                    curr.next = n2;
                    n2 = n2.next;
                }
            }
            curr = curr.next;
        }
        return head.next;
    }
}