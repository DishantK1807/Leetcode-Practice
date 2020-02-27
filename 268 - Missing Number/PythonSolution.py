class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        x = sorted(nums)
        if x[0] != 0:
            return 0

        length = len(nums)
        for i in range(length):
            if (x[i] != i):
                return i

        return length
