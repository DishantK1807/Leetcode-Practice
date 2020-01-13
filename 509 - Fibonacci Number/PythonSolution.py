class Solution:

    cache = {}
    def fib(self, N: int) -> int:
        if (N in self.cache):
            return self.cache[N]

        result = 0

        if N < 2:
            result = N

        else:
            result = self.fib(N-1) + self.fib(N-2)

        self.cache[N] = result

        return result