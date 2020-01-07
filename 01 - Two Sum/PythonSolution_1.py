class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_obj = {}
        remainder = 0

        for i in range(len(nums)):
            remainder = target - nums[i];
            if remainder in dict_obj:
                return [dict_obj[remainder], i]
            else:
                dict_obj[nums[i]] = i


        return [0,0]