class Solution {
    public int strStr(String haystack, String needle) {
        int haystack_len = haystack.length();
        int frame_len = needle.length();

        if(haystack.equals(needle))
            return 0;

        for(int i = 0; i < haystack_len-frame_len+1; i++){
            if (needle.equals(haystack.substring(i, frame_len + i)))
                return i;
        }

        return -1;
    }
}