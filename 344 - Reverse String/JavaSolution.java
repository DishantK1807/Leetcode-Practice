class Solution {
    public void reverseString(char[] s) {
        helper(0, s, s.length-1);
    }

    public void helper(int start, char[] str, int end){
        if (start >= end)
            return;
        else{
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            helper(start+1, str, end-1);
        }
    }
}