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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : nums) {
            set.add(num);
        }

        while (head != null) {
            if (!set.contains(head.val)) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}