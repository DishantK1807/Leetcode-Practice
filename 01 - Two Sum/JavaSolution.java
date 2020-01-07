class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> val = new HashMap<>();
        int remainder = 0;

        for(int i = 0; i < nums.length; i++){
            remainder = target - nums[i];
            if(val.containsKey(remainder))
                return new int[] {val.get(remainder), i};
            else
                val.put(nums[i], i);
        }

        return new int[] {0,0};
    }
}