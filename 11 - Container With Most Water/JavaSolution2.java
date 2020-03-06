class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int max_area  = Integer.MIN_VALUE;
        int left = 0;
        int size = height.length;
        int right = size - 1;
        int min_height = Integer.MIN_VALUE;

        while(left < right){
            min_height = Math.min(height[left], height[right]);
            area = min_height * (right - left);

            if (min_height == height[left])
                left++;
            else
                right--;

            max_area = Math.max(max_area, area);

        }

        return max_area;


    }
}