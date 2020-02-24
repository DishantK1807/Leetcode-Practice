class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true){
            slow = next(slow);
            fast = next(next(fast));
            if (slow == 1 || fast == 1)
                return true;
            if (slow == fast)
                return false;
        }
    }

    public int next(int n){
        int res = 0;
        int val = 0;
        while(n > 0){
            val = n % 10;
            res += (val*val);
            n = n / 10;
        }

        return res;
    }
}