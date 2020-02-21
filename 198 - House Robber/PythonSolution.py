class Solution:
    def rob(self, nums: List[int]) -> int:
        length = len(nums)

        if length == 0:
            return 0
        if length == 1:
            return nums[0]

        for i in range(2, length, 1):
            if i == 2:
                nums[i] = nums[i] + nums[i-2]

            else:
                nums[i] = max(nums[i] + nums[i-2], nums[i] + nums[i-3])


        return max(nums[length-1], nums[length-2])
