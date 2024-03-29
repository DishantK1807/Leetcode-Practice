class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] result = {0, 0};
        int mid = start + ((end - start) / 2);
        while(start <= end){
            if (numbers[start] + numbers[end] < target)
                start++;
            else if (numbers[start] + numbers[end] > target)
                end--;
            else{
                result[0] = start + 1;
                result[1] = end + 1;
                return result;
            }
        }
        return result;
    }
}