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
        ListNode prev = null;

        while(head != null){
        ListNode curr = head;
        head = head.next;
        curr.next = prev;
        prev = curr;

        }

        return prev;
    }
}