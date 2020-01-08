/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode temp1 = head.next;
        ListNode temp2 = null;

        if (temp1.next != null)
            temp2 = swapPairs(temp1.next);

        head.next = temp2;
        temp1.next = head;

        return temp1;
    }
}