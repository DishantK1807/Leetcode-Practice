class Solution {
    public char findTheDifference(String s, String t) {
        int[] char_arr = new int[26];
        int index = 0;
        for(char c: s.toCharArray()){
            char_arr[c - 'a'] += 1;
        }

        for(char c: t.toCharArray()){
            char_arr[c - 'a'] -= 1;
            if(char_arr[c - 'a'] < 0){
                break;
            }
            index++;
        }
        return t.charAt(index);
    }
}