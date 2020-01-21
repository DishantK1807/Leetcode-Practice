/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode ret = head;
        ListNode last = helper(head, head.next);

        return head;
    }

    public ListNode helper(ListNode head, ListNode next){
        if(next == null)
            return null;
        if (head.val == next.val){
            head.next = next.next;
            return helper(head, head.next);
        }

        return helper(next, next.next);
    }


}