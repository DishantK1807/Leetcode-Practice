# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        num = ListNode(0)
        return_node = num
        carry = 0

        while(l1 != None or l2 != None):
            var1 = l1.val if l1 != None else 0
            var2 = l2.val if l2 != None else 0
            add = var1 + var2 + carry
            carry = 0

            if add > 9:
                carry = 1
                add -= 10

            num.next = ListNode(add)
            num = num.next
            l1 = l1.next if l1 != None else l1
            l2 = l2.next if l2 != None else l2


        if carry > 0:
            num.next = ListNode(carry)

        return return_node.next


