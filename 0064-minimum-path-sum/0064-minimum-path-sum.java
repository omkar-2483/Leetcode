class Solution {
    public int minPathSum(int[][] grid) {
        //pathSum[i][j] = grid[i][j] + Math.min(pathSum[i+1][j], pathSum[i][j+1])
        int m=grid.length, n=grid[0].length;
        int[][] pathSum = new int[m][n];

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0;j--){
                if(i==m-1 && j==n-1) pathSum[i][j] = grid[i][j];
                else if(i==m-1) pathSum[i][j] = grid[i][j]+pathSum[i][j+1];
                else if(j==n-1) pathSum[i][j] = grid[i][j]+pathSum[i+1][j];
                else{
                    pathSum[i][j] = grid[i][j]+ Math.min(pathSum[i+1][j], pathSum[i][j+1]);
                }
            }
        }

        return pathSum[0][0];
    }
}