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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode t = head;
        ListNode curr = head;
        ListNode prev = null;
        int cnt = 0;

        while (t != null && cnt < k) {
            t = t.next;
            cnt++;
        }
        if (cnt < k) {
            return head;
        }
        for (int i = k; i > 0; i--) {
            t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;

        }
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}
