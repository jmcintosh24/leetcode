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
    public ListNode middleNode(ListNode head) {
        
        ListNode first = head;
        ListNode second = first;
        int i = 1;
        
        while(second != null && second.next != null) {
            first = first.next;
            second = first;
            for(int j = 0; j < i; j++)
                second = second.next;
            i++;
        }
        
        return first;
        
    }
}