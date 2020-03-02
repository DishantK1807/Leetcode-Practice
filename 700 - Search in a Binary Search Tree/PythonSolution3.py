# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def searchBST(self, root: TreeNode, val: int) -> TreeNode:
        if root == None:
            return None

        return self.helper(root, val)

    def helper(self, root: TreeNode, val:int) -> TreeNode:
        if (root.val == val):
            return root
        if (val > root.val and root.right != None):
            return self.helper(root.right, val)
        elif val < root.val and root.left != None:
            return self.helper(root.left, val)

        return None