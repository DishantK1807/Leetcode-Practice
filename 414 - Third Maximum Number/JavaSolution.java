import java.util.HashSet;

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;

        for(i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int[] new_nums = new int[set.size()];
        i = 0;

        for(int ele: set){
            new_nums[i] = ele;
            i++;
        }

        Arrays.sort(new_nums);

        if (new_nums.length <= 2){
            return new_nums[new_nums.length - 1];
        }

        return new_nums[new_nums.length - 3];

    }
}