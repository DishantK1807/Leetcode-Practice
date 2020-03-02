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

        while(root != None):
            if (root.val == val):
                return root
            if (val > root.val):
                root = root.right;
            else:
                root = root.left

        return None