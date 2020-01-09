class Solution:
    dp = []
    def generate(self, numRows: int) -> List[List[int]]:
        self.dp = [[0] * numRows for i in range(numRows)]
        pascal_triangle1 = []
        self.pascal_triangle(pascal_triangle1, numRows)

        return pascal_triangle1


    def pascal_triangle(self, pascal_triangle1: List[List[int]], numRows: int) -> None:
        for i in range(numRows):
            inner_list = list()

            for j in range(i + 1):
                inner_list.append(self.dfs(i,j))

            pascal_triangle1.insert(i, inner_list)


    def dfs(self, i: int, j: int) -> int:
        if j == 0 or i == j:
            return 1
        if self.dp[i][j] != 0:
            return self.dp[i][j]

        self.dp[i][j] = self.dfs(i-1, j-1) + self.dfs(i-1, j)
        return self.dp[i][j]