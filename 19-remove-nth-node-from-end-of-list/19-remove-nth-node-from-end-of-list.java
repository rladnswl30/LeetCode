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
            current = current.next;
        }
//        System.out.println(current.toString());

        while (current != null) {
            current = current.next;
            nthNode = nthNode.next;
        }

//        System.out.println(nthNode.toString());
        nthNode.next = nthNode.next.next;

        return res.next;
    }
}