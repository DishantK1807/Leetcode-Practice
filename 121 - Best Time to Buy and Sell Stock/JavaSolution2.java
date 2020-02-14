class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2){
            return 0;
        }

        int maxProfit = 0;
        int[] profitArray = new int[len];

        profitArray[len - 1] = prices[len - 1];

        for(int i = len - 2; i >= 0; i--){
            profitArray[i] = prices[i] > profitArray[i+1] ? prices[i] : profitArray[i+1];
        }

        for (int i = 0; i < len; i++){
            if (maxProfit < profitArray[i] - prices[i])
                maxProfit = profitArray[i] - prices[i];
        }

        return maxProfit;
    }
}