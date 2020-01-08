# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:

        if not head or not head.next:
            return head

        temp1 = head.next
        temp2 = None

        if (temp1.next != None):
            temp2 = self.swapPairs(temp1.next)

        head.next = temp2
        temp1.next = head

        return temp1
