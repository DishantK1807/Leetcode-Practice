class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums, 1, nums[0]);
    }

    public int helper(int[] nums, int start, int value){
        int count = 1;

        for(int i = start; i< nums.length; i++){
            if (nums[i] == value){
                count ++;
            }
            else{
                count--;
            }

            if (count == 0){
                return helper(nums, i+1, nums[i]);
            }
        }

        return value;
    }
}