/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        HashMap<ListNode, Integer> map = new HashMap<>();
        
        while(current != null) {
            if(map.get(current) != null)
                return true;
        
            map.put(current, 0);
            current = current.next;
        }
        
        return false;
    }
}