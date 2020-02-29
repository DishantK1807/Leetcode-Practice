class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long i = 1;
        while (i * i < num) {
            i += 1;
            if (i * i == num) return true;
        }
        return false;
    }
}