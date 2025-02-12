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
    public ListNode sortList(ListNode head) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    ListNode temp = head,temp1 = head;

    while(temp != null){
        pq.add(temp.val);
        temp = temp.next;
    }

    while(temp1 != null){
        temp1.val = pq.poll();
        temp1 = temp1.next;
    }
    return head;    
    }
}