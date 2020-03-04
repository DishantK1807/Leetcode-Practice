/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode end = head;
        if(head.next == null){
            return null;
        }
        while (n > 0){
            end = end.next;
            n--;
        }
        if(end == null){
            return head.next;
        }
        while(end.next != null){
            end = end.next;
            start = start.next;
        }

        start.next = start.next.next;

        return head;
    }
}