# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:

        start = head
        end = head

        if (head.next == None):
            return None

        while(n > 0):
            end = end.next
            n -= 1

        if end == None:
            return head.next

        while(end.next != None):
            end = end.next
            start = start.next

        start.next = start.next.next

        return head
