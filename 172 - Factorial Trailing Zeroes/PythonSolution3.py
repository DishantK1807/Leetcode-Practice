class Solution:
    def trailingZeroes(self, n: int) -> int:
        five_count = 0
        count = 1
        while n // (5 ** count) > 0:
            five_count += n // (5 ** count)
            count += 1
        return five_count