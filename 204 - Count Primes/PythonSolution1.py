class Solution:
    def countPrimes(self, n: int) -> int:
        if n < 2:
            return 0

        ret_val = n - 2
        composite = [False] * (n+1)
        i = 2
        while(i * i < n):
            if(composite[i]):
                pass

            j = 2
            while(j * i < n):
                if(not composite[i*j]):
                    composite[i*j] = True
                    ret_val -= 1
                j += 1

            i += 1


        return ret_val