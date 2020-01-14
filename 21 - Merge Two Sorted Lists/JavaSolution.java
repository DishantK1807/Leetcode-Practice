/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode curr = l3;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
                l3 = l3.next;
            }

            else{
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
        }

        if (l1 != null)
            l3.next = l1;

        if (l2 != null)
            l3.next = l2;

        return curr.next;
    }
}