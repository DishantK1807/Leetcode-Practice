# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        height = 0
        if not root:
            return True

        l_height = 0 if not root.left else self.maxDepth(root.left)
        r_height = 0 if not root.right else self.maxDepth(root.right)
        diff = abs(l_height - r_height)
        if diff > 1:
            return False

        return self.isBalanced(root.left) and self.isBalanced(root.right)



    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0

        return max(1 + self.maxDepth(root.left), 1 + self.maxDepth(root.right))
