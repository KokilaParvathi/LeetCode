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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = head;

        for (int i = 1; i < k; i++) {
            front = front.next;
        }

        ListNode back = head;
        ListNode curr = front.next;

        while (curr != null) {
            curr = curr.next;
            back = back.next;
        }

        int temp = front.val;
        front.val = back.val;
        back.val = temp;

        return head;
    }
}
