class Solution:
    def climbStairs(self, n: int) -> int:

        if (n < 4):
            return n

        a = 0
        b = 1
        temp = 0
        for i in range(n):
            temp = b
            b = a + b
            a = temp

        return b