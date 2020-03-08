class Solution {
    public int divide(int dividend, int divisor) {
        int count = 0;
        boolean isNegativeD = false;
        boolean isNegatived = false;
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if (dividend < 0){
            isNegativeD = true;
            dividend = 0-dividend;
        }
        if (divisor < 0){
            isNegatived = true;
            divisor = -divisor;
        }

        if (divisor == 1){
            if(isNegativeD)
                dividend = -dividend;
            if(isNegatived)
                dividend = -dividend;

            return dividend;

        }
        while(dividend - divisor >= 0){
            dividend -= divisor;
            count++;
        }

        if(isNegativeD)
            count = -count;

        if(isNegatived)
            count = -count;

        return count;
    }
}