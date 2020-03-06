class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int max_area  = Integer.MIN_VALUE;

        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
                area = Math.min(height[i], height[j]) * (j-i);
                max_area = Math.max(max_area, area);
            }
        }
        return max_area;
    }
}