class Solution:
    def kthGrammar(self, N: int, K: int) -> int:
        if N == 1:
            return 0

        if N == 2:
            return K - 1

        val = self.kthGrammar(N-1, (K+1)//2)

        if K & 1:
            return val

        else:
            return 1 - val