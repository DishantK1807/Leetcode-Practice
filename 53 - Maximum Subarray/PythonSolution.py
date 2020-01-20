class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        length = len(nums)

        if len == 0:
            return 0

        sums = nums[0]
        max_sum = sums

        for i in range(1,length):
            sums = max(sums + nums[i], nums[i])
            max_sum = max(max_sum, sums)


        return max_sum