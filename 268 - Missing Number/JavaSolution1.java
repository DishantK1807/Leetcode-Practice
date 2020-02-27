class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0){
            return 0;
        }
        int n = nums.length;
        int sum = 0;
        int sum2 = 0;

        if(n % 2 == 0){
            sum = ((n+1)/2) * (n+1);
        }
        else{
            sum = ((n+1)/2) * n;
        }

        for(int i = 1; i < n; i++){
            sum2 += nums[i];
        }

        return sum - sum2;


    }
}