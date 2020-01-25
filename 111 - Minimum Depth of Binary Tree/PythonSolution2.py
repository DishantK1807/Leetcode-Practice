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

        nodes = [root]
        depth = 0
        while nodes:
            child_nodes = []
            depth += 1
            for node in nodes:
                l, r = node.right, node.left
                if not l and not r:
                    return depth

                if l:
                    child_nodes.append(l)

                if r:
                    child_nodes.append(r)

            nodes = child_nodes

        return depth