# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:

        if not root:
            return 0

        nodes = [root]
        depth = 0
        while nodes:
            child_nodes = []
            for node in nodes:
                l, r = node.right, node.left
                if l:
                    child_nodes.append(l)
                if r:
                    child_nodes.append(r)

            depth += 1
            nodes = child_nodes

        return depth