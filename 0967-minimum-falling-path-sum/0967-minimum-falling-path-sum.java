class Solution {
    public int minFallingPathSum(int[][] matrix) {
        //dp[i][j]=matrix[i][j]+min(dp[i+1][j-1], dp[i+1][j],dp[i+1][j+1]);
        int n=matrix.length;
        for(int i=n-2; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(j==n-1){
                    matrix[i][j]+=Math.min(matrix[i+1][j-1], matrix[i+1][j]);
                }else if(j==0){
                    matrix[i][j]+=Math.min(matrix[i+1][j], matrix[i+1][j+1]);
                }else{
                    matrix[i][j]+=Math.min(matrix[i+1][j-1],Math.min(matrix[i+1][j], matrix[i+1][j+1]));
                }
            }
        }
        int minSum=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minSum=Math.min(minSum, matrix[0][i]);
        }
        return minSum;
    }
}