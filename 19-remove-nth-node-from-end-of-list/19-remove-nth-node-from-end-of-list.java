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
        ListNode res = new ListNode();
        res.next = head;

        ListNode current = res;
        ListNode nthNode = res;

        for (int i = 1; i <= n + 1; i++) {
            nthNode = nthNode.next;
        }
//        System.out.println(current.toString());

        while (nthNode != null) {
            nthNode = nthNode.next;
            current = current.next;
        }

//        System.out.println(nthNode.toString());
        current.next = current.next.next;

        return res.next;
    }
}