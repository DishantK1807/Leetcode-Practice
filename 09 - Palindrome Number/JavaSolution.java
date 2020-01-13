class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        boolean result = false;
        int val = x;
        int temp = 0;
        int rev = 0;
        while ( x != 0){
            temp = x % 10;
            x = x / 10;
            rev = (rev*10) + temp;
        }

        if (rev == val)
            result = true;

        return result;
    }
}