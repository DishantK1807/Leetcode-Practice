class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0){
            return 0;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i] != i)
                return i;
        }

        return n;
    }
}