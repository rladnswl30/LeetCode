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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode();
        ListNode res = tmp;

        boolean add = false;
        while (l1 != null || l2 != null || add) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (add) {
                sum += 1;
            }

            tmp.next = new ListNode(sum % 10);
            add = sum / 10 > 0;
            tmp = tmp.next;
        }

        return res.next;
    }
}