class Solution:
    def countPrimes(self, n: int) -> int:
        if (n <= 2):
            return 0

        prime = [1] * n
        prime[0] = 0
        prime[1] = 0
        i = 2

        while(i < n**0.5+1):
            if (prime[i]):
                prime[i*i:n:i] = [0] * (1+(n-1-i*i)//i)

            i += 1


        return sum(prime)
