/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
            }


        if(fast!=null){
            slow = slow.next;
        }

        while(prev!=null){
            if(prev.val != slow.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }
}