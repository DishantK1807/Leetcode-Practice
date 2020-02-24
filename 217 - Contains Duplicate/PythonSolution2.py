class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        sort_nums = sorted(nums)

        for i in range(1,len(nums),1):
            if (sort_nums[i] == sort_nums[i-1]):
                return True

        return False