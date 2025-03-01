class Solution {
    public int minFallingPathSum(int[][] matrix) {
        //dp[i][j]=matrix[i][j]+min(dp[i+1][j-1], dp[i+1][j],dp[i+1][j+1]);
        //we will use prev and cur row for dp
        int n=matrix.length;
        int[] prev = matrix[n-1];

        for(int i=n-2; i>=0; i--){
            int[] cur = new int[n];
            for(int j=n-1; j>=0; j--){
                if(j==n-1){
                    cur[j] = matrix[i][j]+Math.min(prev[j-1], prev[j]);
                }else if(j==0){
                    cur[j] = matrix[i][j]+Math.min(prev[j], prev[j+1]);
                }else{
                    cur[j] = matrix[i][j]+Math.min(prev[j-1],Math.min(prev[j], prev[j+1]));
                }
            }
            prev=cur;
        }
        int minSum=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minSum=Math.min(minSum, prev[i]);
        }
        return minSum;
    }
}