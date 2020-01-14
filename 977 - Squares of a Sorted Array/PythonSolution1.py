class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        for i in range(len(A)):
            A[i] = A[i] * A [i]

        result = sorted(A)
        return result