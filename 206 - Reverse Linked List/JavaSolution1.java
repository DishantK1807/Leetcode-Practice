/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null;

       return  helper(head, prev);
    }

    public ListNode helper(ListNode head, ListNode prev){
        if ( head == null)
            return prev;

        ListNode temp1 = head.next;
        head.next = prev;

        return helper(temp1, head);
    }
}