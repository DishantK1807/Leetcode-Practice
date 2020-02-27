class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i=nums.length - 1; i>=0; i--) {
            res ^= nums[i]^i;
        }
        return res;
    }
}