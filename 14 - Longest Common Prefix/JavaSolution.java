class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = Integer.MAX_VALUE;
        String ans = "";

        for (String str : strs){
            if(min_len > str.length()){
                min_len = str.length();
                ans = str;
            }
        }
        for(String str : strs){

            if(ans.equals(str.substring(0,min_len))){
                continue;
            }

            else{
               while(min_len>0 && !ans.equals(str.substring(0,min_len))){
                   min_len--;
                   ans = ans.substring(0, min_len);
               }
            }

        }

        return ans;
    }
}