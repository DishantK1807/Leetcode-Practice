class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = len(nums1) - 1
        while(i >= 0):
            if (m > 0 and n > 0):
                if (nums1[m-1] > nums2[n-1]):
                    nums1[i] = nums1[m-1]
                    m = m - 1
                else:
                    nums1[i] = nums2[n-1]
                    n = n - 1

            else:
                if m > 0:
                    nums1[i] = nums1[m-1]
                    m = m - 1
                else:
                    nums1[i] = nums2[n-1]
                    n = n - 1

            i = i - 1