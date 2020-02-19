class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        val_map = {}
        max_value = -99999999
        max_key = 0
        majority_element = math.floor(len(nums) // 2)

        for i in nums:
            if (i in val_map):
                val_map[i] = val_map[i] + 1
            else:
                val_map[i] = 1

        for i, j in val_map.items():
            if j >= max_value and j >= majority_element:
                max_value = j
                max_key = i

        return max_key

