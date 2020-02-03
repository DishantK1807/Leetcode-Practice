# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> TreeNode:

        length = len(nums)

        if length == 0:
            return None

        mid = length // 2
        left = mid - 1

        root = TreeNode(0)

        if length == 1:
            root = TreeNode(nums[0])

        elif length == 2:
            root = TreeNode(nums[1])
            root.left = TreeNode(nums[0])

        elif length == 3:
            root = TreeNode(nums[1])
            root.left = TreeNode(nums[0])
            root.right = TreeNode(nums[2])

        else:
            root = TreeNode(nums[mid])
            root.left = self.sortedArrayToBST(nums[0:mid])
            root.right = self.sortedArrayToBST(nums[mid+1:length])

        return root
