class Solution:
    def maxArea(self, height: List[int]) -> int:
        area = 0
        max_area = 0
        size = len(height)
        left = 0
        right = size - 1
        min_height = 0

        while left < right:
            min_height = min(height[left], height[right])
            area = min_height * (right - left)

            if min_height == height[left]:
                left += 1
            else:
                right -= 1

            max_area = max(max_area, area)


        return max_area
