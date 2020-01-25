# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def minDepth(self, root: TreeNode) -> int:

        if not root:
            return 0

        elif not root.left or not root.right:
            return max(1 + self.minDepth(root.right), 1 + self.minDepth(root.left))

        return min(1 + self.minDepth(root.right), 1 + self.minDepth(root.left))
