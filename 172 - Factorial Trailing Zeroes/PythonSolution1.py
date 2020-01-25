class Solution:
    def trailingZeroes(self, n: int) -> int:
        if n <= 4:
            return 0

        count  = 0
        while(n > 4):
            n //= 5
            count += n

        return count