class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        length = len(prices)
        print(length)
        if length < 2:
            return 0

        maxProfit = 0
        profitArray = [0] * length

        profitArray[length-1] = prices[length-1]
        for i in range(length-2, -1, -1):
            profitArray[i] = prices[i] if prices[i] > profitArray[i+1] else profitArray[i+1]

        for i in range(length):
            if maxProfit < profitArray[i] - prices[i]:
                maxProfit = profitArray[i] - prices[i]

        return maxProfit