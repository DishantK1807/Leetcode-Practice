# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        if (head == None or head.next == None):
            return True


        fast = head
        slow = head
        prev = None

        while(fast != None and fast.next != None):
            fast = fast.next.next
            temp = slow.next
            slow.next = prev
            prev = slow
            slow = temp

        if (fast != None):
            slow = slow.next

        while(prev != None):
            if (prev.val != slow.val):
                return False
            prev = prev.next
            slow = slow.next


        return True