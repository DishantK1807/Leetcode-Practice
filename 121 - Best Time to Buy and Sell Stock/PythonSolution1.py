class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        length = len(prices)

        if length < 2:
            return 0

        profit = 0
        maxProfit = -999999
        minimum = 999999
        maximum = -999999

        for i in range(length):
            if (prices[i] < minimum and i < length - 1):
                minimum = prices[i]
                maximum = prices[i+1]

            if (prices[i] > maximum):
                maximum = prices[i]

            profit = maximum - minimum
            maxProfit = max(maxProfit, profit)


        return maxProfit