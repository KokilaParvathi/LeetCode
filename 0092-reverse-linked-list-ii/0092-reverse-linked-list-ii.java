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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) return head;

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        int pos = 1;
        while (temp != null) {
            if (pos >= left && pos <= right) {
                list.add(temp.val);
            }
            temp = temp.next;
            pos++;
        }

        temp = head;
        pos = 1;
        int idx = list.size() - 1;
        while (temp != null) {
            if (pos >= left && pos <= right) {
                temp.val = list.get(idx--);
            }
            temp = temp.next;
            pos++;
        }

        return head;
    }
}
