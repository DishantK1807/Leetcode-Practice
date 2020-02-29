class Solution {
    public String reverseVowels(String s) {
        String x = s.trim();
        if (x.isEmpty()){
            return s;
        }
        int left = 0;
        int right = s.length()-1;
        Character arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        HashSet<Character> vowels = new HashSet<>(Arrays.asList(arr));
        char[] chars = s.toCharArray();
        while(left <= right){
            if(!vowels.contains(chars[left])){
                left++;
            }
            else if(!vowels.contains(chars[right])){
                right--;
            }
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(chars);

    }
}