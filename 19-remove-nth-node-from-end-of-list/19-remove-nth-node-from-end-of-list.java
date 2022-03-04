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
        int length = 1;
        ListNode list = head;
        while (list.next != null) {
            length++;
            list = list.next;
        }

        ListNode current = head;
        ListNode prev = head;

        if (length == n) {
            head = current.next;
        } else {
            int idx = 0;
            while (idx++ < length - n) {
                prev = current;
                current = prev.next;
            }
            prev.next = current.next;
        }
        current.next = null;

        return head;
    }
}