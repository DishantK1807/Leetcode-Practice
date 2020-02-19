class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        return self.helper(nums, 1, nums[0])


    def helper(self, nums: List[int], start: int, value: int) -> int:
        count = 1
        for i in range(start, len(nums), 1):
            if value == nums[i]:
                count += 1
            else:
                count -= 1

            if count == 0:
                return self.helper(nums, i+1, nums[i])


        return value

