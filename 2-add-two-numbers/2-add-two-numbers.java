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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        
        ListNode head = new ListNode();
        ListNode curr = head;
        
        int carry = 0;
        
        while(node1 != null || node2 != null) {
            int sum = 0;
            if(node1 == null) 
                sum = node2.val + carry;
            else if(node2 == null)
                sum = node1.val + carry;
            else
                sum = node1.val + node2.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if(node1 != null)
                node1 = node1.next;
            if(node2 != null)
                node2 = node2.next;
        }
        
        if(carry > 0) 
            curr.next = new ListNode(carry);
        
        return head.next;
        
    }
}