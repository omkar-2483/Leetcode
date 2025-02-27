class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //path[i][j] = path[i+1][j]+path[i][j+1]
        int m =obstacleGrid.length;
        int n =obstacleGrid[0].length;

        int[] prev = new int[n];
        prev[n-1]=1;

        for(int i=m-1; i>=0; i--){
            int[] curr = new int[n];
            if(obstacleGrid[i][n-1]!=1) curr[n-1]=prev[n-1];
            else curr[n-1]=0;

            for(int j=n-2; j>=0; j--){
                if(i==m-1){
                    if(obstacleGrid[i][j]!=1) curr[j]=curr[j+1];
                    else curr[j]=0;
                }else{
                    if(obstacleGrid[i][j]!=1) curr[j]=curr[j+1]+prev[j];
                    else curr[j]=0;
                }
            }
            prev=curr;
        }
        return prev[0];
    }
}