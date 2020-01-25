# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:

        lenA = self.getDepth(headA)
        lenB = self.getDepth(headB)

        diff = lenA - lenB

        if diff > 0:
            while(diff > 0):
                headA = headA.next
                diff -= 1
        else:
            while(diff < 0):
                headB = headB.next
                diff += 1

        while (headA != headB):
            headA = headA.next
            headB = headB.next

        return headA



    def getDepth(self, head: ListNode) -> int:
        length = 0
        while(head != None):
            head = head.next
            length += 1

        return length
