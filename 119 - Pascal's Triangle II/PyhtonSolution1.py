class Solution:
    dp = []
    def getRow(self, rowIndex: int) -> List[int]:
        numRows = rowIndex + 1
        self.dp = [[0] * numRows for i in range(numRows)]

        pascal_row = []

        for i in range(rowIndex + 1):
            temp = []
            for j in range(i+1):
                temp.append(self.dfs(i,j))

            pascal_row = temp.copy()

        return pascal_row


    def dfs(self, i:int , j:int) -> int:
        if j == 0 or i == j:
            return 1
        if self.dp[i][j] != 0:
            return self.dp[i][j]

        self.dp[i][j] = self.dfs(i-1,j-1) + self.dfs(i-1,j)

        return self.dp[i][j]