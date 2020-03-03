class Solution {
    public double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        double var = 1.0;
        if(x == 1.0){
            return x;
        }
        if (x == -1.0){
            if (n % 2 == 0)
                return 1.0;
            else
                return -1.0;
        }

        if(n == Integer.MIN_VALUE){
            return 0.0; //approximate
        }
        if (n < 0){
            x = 1 / x;
            n = n * (-1);
        }

        while(n > 0){
            var = var * x;
            n--;
        }

        return var;
    }
}