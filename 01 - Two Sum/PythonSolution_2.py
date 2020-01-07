class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_obj = {}

        for i, num in enumerate(nums):
            remainder = target - num
            if remainder in dict_obj:
                return [dict_obj[remainder], i]

            dict_obj[num] = i