class Solution {
    public int divide(int dividend, int divisor) {
        boolean pos = false;
        if(dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0)
            pos = true;

        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);

        long multiple = divideWrapper(dividendLong, divisorLong);

        if(pos) {
            if(multiple > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else {
                return (int)multiple;
            }
        }
        else {
            if(0 - multiple < Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            else {
                return 0 - (int)multiple;
            }
        }
    }

    private long divideWrapper(long dividend, long divisor) {
        if(dividend < divisor)
            return 0;

        long sum = divisor, multiple = 1;

        while((sum + sum) <= dividend) {
            sum += sum;
            multiple += multiple;
        }

        return multiple + divideWrapper(dividend - sum, divisor);
    }
}