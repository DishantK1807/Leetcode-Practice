class Solution {
    public int trailingZeroes(int n) {

        if (n <=4)
            return 0;

        n /= 5;

        return n + trailingZeroes(n);
    }
}