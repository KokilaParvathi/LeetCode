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
        int a = (l1 != null) ? l1.val : 0;
        int b = (l2 != null) ? l2.val : 0;
        int sum = a + b,carry = sum / 10;

        ListNode head = new ListNode(sum % 10);
        ListNode curr = head;

        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;

        while (l1 != null || l2 != null || carry != 0) {
            a = (l1 != null) ? l1.val : 0;
            b = (l2 != null) ? l2.val : 0;

            sum = a + b + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head;
    }
}
