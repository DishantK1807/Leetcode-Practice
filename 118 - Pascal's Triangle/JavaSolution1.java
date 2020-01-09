class Solution {
    int[][] dp;

    public List<List<Integer>> generate(int numRows) {
        dp = new int[numRows][numRows];
        List<List<Integer>> pascal_triangle1 = new ArrayList<>();

        pascal_triangle(pascal_triangle1, numRows);

        return pascal_triangle1;
    }

    public void pascal_triangle(List<List<Integer>> pascal_triangle1, int numRows){
        for(int i = 0; i < numRows; i++){
            List<Integer> result = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                result.add(dfs(i,j));
            }

            pascal_triangle1.add(result);

        }
    }

    private int dfs(int i, int j){
        if (j == 0 || i == j)
            return 1;
        if(dp[i][j] != 0)
            return dp[i][j];

        return dp[i][j] = dfs(i-1, j-1) + dfs(i-1, j);
    }
}