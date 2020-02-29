class Solution {
    public int firstUniqChar(String s) {
        int[] cc = new int[26];
        char[] ca = s.toCharArray();
        int size = ca.length;
        for (char c : ca) {
            cc[c - 'a']++;
        }

        for (int i = 0; i < size; ++i) {
            if (cc[ca[i] - 'a'] == 1) return i;
        }

        return -1;
    }
}