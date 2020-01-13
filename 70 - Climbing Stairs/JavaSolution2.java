class Solution {
    public int climbStairs(int n) {
        if(n < 4)
            return n;

        int a = 0;
        int b = 1;

        int temp = 0;

        for (int i = 1; i <= n; i++){
            temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }
}