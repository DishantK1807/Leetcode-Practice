/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode num = new ListNode(0);
        ListNode ret = num;
        int carry = 0;

        while(l1 != null || l2 != null){
            int var1 = l1 != null ? l1.val : 0;
            int var2 = l2 != null ? l2.val : 0;

            int add = var1 + var2 + carry;
            carry = 0;

            if (add > 9){
                carry = 1;
                add -= 10;
            }

            num.next = new ListNode(add);
            num = num.next;
            l1 = l1 != null ? l1.next: l1;
            l2 = l2 != null ? l2.next: l2;
        }

        if(carry > 0){
            num.next = new ListNode(carry);
        }

        return ret.next;
    }
}