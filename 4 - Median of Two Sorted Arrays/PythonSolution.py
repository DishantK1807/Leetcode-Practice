class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n1 = len(nums1)
        n2 = len(nums2)
        total = n1 + n2
        middle = total // 2
        tot = [0] * total
        i = 0
        j = 0
        k = 0

        while(i < n1 and j < n2):
            if nums1[i] <= nums2[j]:
                tot[k] = nums1[i]
                i += 1
            else:
                tot[k] = nums2[j]
                j += 1

            if k == middle:
                if total % 2 == 0:
                    return (tot[middle] + tot[middle-1]) / 2
                else:
                    return tot[middle]

            k += 1


        while(i<n1):
            tot[k] = nums1[i]
            i += 1

            if k == middle:
                if total % 2 == 0:
                    return (tot[middle] + tot[middle-1]) / 2
                else:
                    return tot[middle]
            k += 1

        while(j < n2):
            tot[k] = nums2[j]
            j += 1

            if k == middle:
                if total % 2 == 0:
                    return (tot[middle] + tot[middle-1]) / 2
                else:
                    return tot[middle]

            k += 1

        return -1
