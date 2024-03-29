class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];

        for (int i = 2; i < nums.length; i++)
        {
            if (i == 2) nums[i] = nums[i] + nums[i - 2];
            else
            {
                nums[i] = Math.max(nums[i] + nums[i - 2], nums[i] + nums[i - 3]);
            }
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}