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
        if (head == null || head.next == null)
            return true;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int mid = size / 2;
        while(mid>0){
            temp = temp.next;
            mid--;
        }
        ListNode prev = temp;
        ListNode midN = temp;
        while(temp != null){
            ListNode curr = temp;
            temp = temp.next;
            curr.next = prev;
            prev = curr;
        }
        mid = size / 2;
        while(mid > 0){
            if (prev.val != head.val)
                return false;

            prev = prev.next;
            head = head.next;
            mid --;
        }

        return true;

    }
}