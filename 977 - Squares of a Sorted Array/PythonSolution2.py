class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        start = 0
        end = len(A) - 1
        result = [0 for i in range(end+1)]
        index = end

        while (start <= end):
            if (abs(A[start]) > A[end]):
                result[index] = A[start] * A[start]
                start += 1

            else:
                result[index] = A[end] * A[end]
                end -= 1

            index -= 1

        return result