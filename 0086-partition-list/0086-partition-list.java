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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        ListNode temp1 = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < x) {
                temp1.val = list.get(i);
                temp1 = temp1.next;
            }
        }

        ListNode temp2 = head;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= x) {
                temp1.val = list.get(i);
                temp1 = temp1.next;
            }
        }

        return head;
    }
}