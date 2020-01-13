# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:

        if head == None or head.next == None:
            return head

        return self.helper(head, None)


    def helper(self, head:ListNode, prev:ListNode) -> ListNode:
        if head == None:
            return prev

        temp1 = head.next
        head.next = prev

        return self.helper(temp1, head)