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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases (like removing the first node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Use two pointers: fast and slow
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer 'n+1' steps ahead so that the gap between slow and fast is n
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both fast and slow until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow is just before the node to delete
        slow.next = slow.next.next;

        // Return the updated list
        return dummy.next;
    }
}