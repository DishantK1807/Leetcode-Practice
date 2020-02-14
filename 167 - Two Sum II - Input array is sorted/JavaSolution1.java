class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap <Integer, Integer> val = new HashMap<>();
        int remainder = 0;

        for(int i = 0; i < numbers.length; i++){
            remainder = target - numbers[i];
            if(val.containsKey(remainder))
                return new int[] {val.get(remainder), i+1};
            else
                val.put(numbers[i], i+1);
        }

        return new int[] {0,0};
    }
}