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
        ListNode dummy = new ListNode (-1);
        dummy.next = head;

        ListNode firstptr = dummy;
        ListNode secondPtr = dummy;

        for (int i =0; i<n; i++){
            secondPtr = secondPtr.next;
        }
        while (secondPtr.next!=null){
            firstptr = firstptr.next;
            secondPtr = secondPtr.next;
        }
        //we now have to remove the node next to first ptr
        firstptr.next = firstptr.next.next;
        return dummy.next;
    }
}