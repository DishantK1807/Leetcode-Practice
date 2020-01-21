class Solution {
    public void rotate(int[] nums, int k) {
        int temp = 0;
        int len = nums.length;
        if(nums.length == 1)
            return ;
        if(k > nums.length)
            k = k - nums.length;
        int[] arr1 = Arrays.copyOfRange(nums, 0, len-k);
        int[] arr2 = Arrays.copyOfRange(nums, len - k, len);
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;

        for(int i = 0; i < arr2_len; i++){
            nums[i] = arr2[i];
        }
        for(int i = 0; i < arr1_len; i++){
            nums[i+arr2_len] = arr1[i];
        }
    }
}