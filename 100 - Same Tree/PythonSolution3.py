# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:

        if not p and not q:
            return True

        if not p or not q:
            return False

        return ((p.val == q.val) and (self.isSameTree(p.right,q.right)) and (self.isSameTree(p.left, q.left)))