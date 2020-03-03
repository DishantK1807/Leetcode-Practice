class Solution:
    def numTrees(self, n: int) -> int:
        arr = [0] * (n+1)

        arr[0], arr[1] = 1,1

        for i in range(2, n+1):
            for j in range(1,i+1):
                arr[i] += arr[j-1] * arr[i-j]

        return arr[n]