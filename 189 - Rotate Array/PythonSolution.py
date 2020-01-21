class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        temp = 0
        length = len(nums)
        if k > length:
            k -= length
        if k == length:
            k = 0
        for i in range(k):
            temp = nums[length-1]
            for j in range(length-1, 0, -1):
                nums[j] = nums[j-1]

            nums[0] = temp