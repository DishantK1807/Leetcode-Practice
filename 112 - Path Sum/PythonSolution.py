# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def hasPathSum(self, root: TreeNode, sum: int) -> bool:
        if not root:
            return False

        sum -= root.val

        if root.left == None and root.right == None and sum == 0:
            return True

        return self.hasPathSum(root.left, sum) or self.hasPathSum(root.right, sum)