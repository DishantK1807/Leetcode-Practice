class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_obj = {}

        for i in range(len(nums)):
            remainder = target - nums[i]
            if remainder in dict_obj:
                return [dict_obj[remainder], i]

            dict_obj[nums[i]] = i