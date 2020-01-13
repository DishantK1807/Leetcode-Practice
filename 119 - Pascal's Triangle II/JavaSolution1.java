class Solution {
    int dp[][];
    public List<Integer> getRow(int rowIndex) {
        dp =  new int[rowIndex+1][rowIndex+1];

        List<Integer> pascal_row = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j <=i; j++){
                temp.add(dfs(i,j));
            }

            pascal_row = temp;
        }

        return pascal_row;
    }


    private int dfs (int i, int j){
        if (j == 0 || i == j)
            return 1;
        if (dp[i][j] != 0)
            return dp[i][j];

        return dp[i][j] = dfs(i-1, j-1) + dfs(i-1, j);
    }
}