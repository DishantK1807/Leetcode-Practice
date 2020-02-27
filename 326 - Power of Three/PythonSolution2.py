class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        return n > 0 and 1853020188851841 % n == 0
