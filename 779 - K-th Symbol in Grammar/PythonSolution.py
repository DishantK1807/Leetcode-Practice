class Solution:
    def kthGrammar(self, N: int, K: int) -> int:
        s = 2 ** (N -1)
        flips = 0

        while(s > 2):
            if (K > (s//2)):
                K -= (s//2)
                flips += 1

            s //= 2

            if (K <= 2):
                break

        K -= 1

        if (flips % 2 == 1):
            K = 1 - K

        return K