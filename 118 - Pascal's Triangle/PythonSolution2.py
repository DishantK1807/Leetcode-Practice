class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        pascal_triangle = []

        for i in range(numRows):
            inner_list = []
            inner_list.append(1)
            for j in range(1,i+1):
                val = (inner_list[j-1] * (i - j + 1)) // j
                inner_list.append(val)

            pascal_triangle.append(inner_list)

        return pascal_triangle