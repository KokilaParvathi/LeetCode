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
    public ListNode oddEvenList(ListNode head) {
    Queue<Integer> evenq = new LinkedList<>();
    Queue<Integer> oddq = new LinkedList<>();
    ListNode temp = head,temp1 = head;
    int count = 0;

    while(temp != null){
        count++;
        if(count % 2 != 0)
            oddq.add(temp.val);
        else
            evenq.add(temp.val);
        temp = temp.next;
    }

        while(!oddq.isEmpty()){
            temp1.val = oddq.poll();
            temp1 = temp1.next; 
        }

        while(!evenq.isEmpty()){
            temp1.val = evenq.poll();
            temp1 = temp1.next; 
        }

        return head;
    }
}