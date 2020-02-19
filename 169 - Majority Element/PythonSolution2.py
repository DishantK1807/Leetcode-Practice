class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums1 = sorted(nums)
        return nums1[len(nums) // 2]

