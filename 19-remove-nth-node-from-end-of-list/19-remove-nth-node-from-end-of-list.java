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
        ListNode list = new ListNode(0);
        list.next = head;

        ListNode current = list;
        ListNode nList = list;

        for (int i = 1; i <= n + 1; i++) {
            current = current.next;
        }

        while (current != null) {
            current = current.next;
            nList = nList.next;
        }

        nList.next = nList.next.next;

        return list.next;
    }
}