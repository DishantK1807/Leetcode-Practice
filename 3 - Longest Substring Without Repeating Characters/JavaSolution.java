class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        HashMap<Character, Integer> lcs = new HashMap<>();
        int max = 0;

        for(int i = 0, j = 0; j < len; j++){
            if (lcs.containsKey(s.charAt(j))){
                i = Math.max(lcs.get(s.charAt(j)), i);
            }

            max = Math.max(max, j - i + 1);
            lcs.put(s.charAt(j), j + 1);
        }

        return max;
    }
}