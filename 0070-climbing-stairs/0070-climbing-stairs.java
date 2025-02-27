class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return helperDP(n, dp);
    }

    private int helperDP(int n, int[] dp){
        if(n<=2 ) return n;

        if(dp[n]==0){
            dp[n]=helperDP(n-1, dp)+helperDP(n-2, dp);
        }

        return dp[n];
    }
}