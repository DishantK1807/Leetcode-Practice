# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def formTree(self, nums):
        if not nums:
            return None

        mid = len(nums)//2

        root = TreeNode(nums[mid])
        root.left = self.formTree(nums[:mid])
        root.right = self.formTree(nums[mid+1:])

        return root


    def sortedArrayToBST(self, nums: List[int]) -> TreeNode:
        return self.formTree(nums)