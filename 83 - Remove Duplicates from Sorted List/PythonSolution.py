# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        ret = head
        last = self.helper(head, head.next)

        return ret


    def helper(self, head: ListNode, nextt: ListNode) -> ListNode:
        if (nextt == None):
            return None
        if (head.val == nextt.val):
            head.next = nextt.next
            return self.helper(head, head.next)

        return self.helper(nextt, nextt.next)