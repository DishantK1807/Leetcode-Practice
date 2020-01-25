# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:

        return self.helper(root, root)


    def helper(self, right: TreeNode, left: TreeNode) -> bool:

        if not right and not left:
            return True

        if not right or not left:
            return False

        return ((right.val == left.val) and self.helper(right.left, left.right) and self.helper(right.right, left.left))