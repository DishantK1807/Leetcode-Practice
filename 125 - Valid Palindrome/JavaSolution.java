class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;


        int len = s.length();
        int low = 0;
        int high = len - 1;
        int mid = len / 2;

        while (low < mid && high >= mid) {
            while (!Character.isLetterOrDigit(s.charAt(low)) && low < mid) low++;
            while (!Character.isLetterOrDigit(s.charAt(high)) && high >= mid) high--;

            if (low < mid && high >= mid) {
                if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) return false;
            }

            low++;
            high--;
        }

        return true;
    }
}