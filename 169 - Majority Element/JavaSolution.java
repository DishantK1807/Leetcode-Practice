import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority_element = (int)Math.floor(nums.length/2);
        int max_value = Integer.MIN_VALUE;
        int max_key = 0;

        for (int i : nums){
            if (map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
            }

            else{
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer,Integer> element  : map.entrySet()){
            if (element.getValue() >= max_value){
                max_value = element.getValue();
                max_key = element.getKey();
            }
        }

        return max_key;
    }
}