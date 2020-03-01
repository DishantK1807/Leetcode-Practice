class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        int sum = 0;
        int count = 0;
        if (s.length() == 0 || s == null){
            return 0;
        }
        for(char c : s.toCharArray()){
            chars.put(c, chars.getOrDefault(c,0) + 1);
        }

        for(Map.Entry<Character, Integer> ele: chars.entrySet()){
            while(ele.getValue() > 1){
                sum += 2;
                chars.replace(ele.getKey(), ele.getValue() - 2);
            }

            if (ele.getValue() == 1){
                count += 1;
            }
        }

        if (count >= 1)
            sum += 1;

        return sum;
    }
}