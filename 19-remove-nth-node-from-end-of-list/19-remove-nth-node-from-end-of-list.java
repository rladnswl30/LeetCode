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

        ListNode left = res;
        ListNode right = res;

        for (int i = 0; i < n + 1; i++) {
            left = left.next;
        }
//        System.out.println(current.toString());

        while (left != null) {
            left = left.next;
            right = right.next;
        }

//        System.out.println(nthNode.toString());
        right.next = right.next.next;

        return res.next;
    }
}