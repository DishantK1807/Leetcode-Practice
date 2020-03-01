class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        int i = 0;
        if(s.length() == 0 || s == null)
            return true;

        for (char c: s.toCharArray()){
            index = t.indexOf(c,i);

            if (index >= i)
                i = index + 1;

            else{
                return false;
            }
        }

        return true;
    }
}