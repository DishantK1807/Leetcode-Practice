class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dict_arr = {}

        for ele in nums1:
            if ele in dict_arr:
                dict_arr[ele] = dict_arr[ele] + 1
            else:
                dict_arr[ele] = 1

        result = []
        for ele in nums2:
            if ele in dict_arr:
                if dict_arr[ele] > 0:
                    result.append(ele)
                    dict_arr[ele] = dict_arr[ele] - 1

        return result