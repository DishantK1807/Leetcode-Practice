# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrderBottom(self, root: TreeNode) -> List[List[int]]:
        if root is None:
            return []

        output = []
        self.helper(output, 1, root)

        return output

    def helper(self, output: List[List[int]], level: int, root: TreeNode):

        if root is None:
            return
        if (level - 1 == len(output)):
            output.insert(0, [])

        self.helper(output, level + 1, root.left)
        self.helper(output, level + 1, root.right)

        index = len(output) - level
        output[index].append(root.val)