/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ret_head = head;
        if (head == null)
            return null;
        if (head.next == null){
            if (head.val == val)
                return null;
            else
                return head;
        }
        while( head != null){
            if (head.val == val){
                head = head.next;
                ret_head = head;
            }

            else if (head.next != null && head.next.val == val)
                head.next = head.next.next;
            else
                head = head.next;
        }

        return ret_head;
    }
}