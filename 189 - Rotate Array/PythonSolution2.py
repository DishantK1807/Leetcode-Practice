class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        temp = 0
        length =len(nums)
        if(length == 1):
            return
        if(k > length):
            k = k - length
        arr1 = nums[0:length-k]
        arr2 = nums[length - k: length]
        arr1_len = len(arr1)
        arr2_len = len(arr2)

        for i in range(arr2_len):
            nums[i] = arr2[i]

        for i in range(arr1_len):
            nums[i+arr2_len] = arr1[i]