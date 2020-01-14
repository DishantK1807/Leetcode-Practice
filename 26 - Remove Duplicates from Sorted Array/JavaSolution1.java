class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]))
                len--;
            else{
                map.put(nums[i], index);
                index++;
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            nums[pair.getValue()] = pair.getKey();
        }
        return len;
    }
}