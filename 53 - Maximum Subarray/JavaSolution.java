class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;

        if (len == 0)
            return 0;

        int sum = nums[0];
        int max_sum = sum;

        for (int i = 1; i < len; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            max_sum = Math.max(max_sum, sum);
        }

        return max_sum;
    }
}