class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums = set(nums)
        nums = sorted(list(nums))

        if (len(nums) < 2):
            return max(nums)

        return nums[len(nums) - 3]

