class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        if (len < 2){
            return 0;
        }
        int p = 0;
        int profit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++){
            if (prices[i] < min && i < len - 1){
                min = prices[i];
                max = prices[i+1];
            }
            if (prices[i] > max){
                max = prices[i];
            }
            p = max - min;
            profit = Math.max(profit, p);
        }

        return profit;
    }
}