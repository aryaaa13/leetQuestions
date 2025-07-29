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
        if (head == null) { // This handles an empty list
            return false;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head; // Both pointers start at the head

        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next; // Slow pointer moves one step
            fastPtr = fastPtr.next.next; // Fast pointer moves two steps

            if (slowPtr == fastPtr) { // If they meet, there's a cycle
                return true;
            }
        }

        return false; // If the loop finishes, no cycle was found
    }
}