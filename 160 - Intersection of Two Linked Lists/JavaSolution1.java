/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = getDepth(headA);
        int lenB = getDepth(headB);

        int diff = lenA - lenB;

        if (diff > 0){
            while(diff > 0){
                headA = headA.next;
                diff--;
            }
        }
        else{
            while (diff < 0){
                headB = headB.next;
                diff++;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }


    public int getDepth(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }

        return length;
    }
}