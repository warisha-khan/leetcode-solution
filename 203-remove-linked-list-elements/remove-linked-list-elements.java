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
        // Create a dummy node before head to handle head deletions easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with target value
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        // Return the updated list
        return dummy.next;
    }
}