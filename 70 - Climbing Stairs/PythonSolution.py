class Solution:
    stairs = {}

    def climbStairs(self, n: int) -> int:
        if (n in self.stairs):
            return self.stairs[n]

        result = 0

        if n < 4:
            result = n
        else:
            result = self.climbStairs(n -1) + self.climbStairs(n-2)

        self.stairs[n] = result

        return result