# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        flg = True
        if not root:
            return True

        elif not root.left and not root.right:
            return True

        else:
            l_height = self.maxDepth(root.left)
            r_heigth = self.maxDepth(root.right)
            diff = abs(l_height - r_heigth)
            if diff > 1:
                flg = False
            else:
                flg = True

        return flg and self.isBalanced(root.left) and self.isBalanced(root.right)



    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0

        return max(1 + self.maxDepth(root.left), 1 + self.maxDepth(root.right))
