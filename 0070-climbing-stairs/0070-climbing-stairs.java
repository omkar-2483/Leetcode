class Solution {
    public int climbStairs(int n) {
        int prev2=0;
        int prev1=1;

        for(int i=2; i<=n; i++){
            int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1+prev2;
    }

    // public int climbStairs(int n) {
    //     int[] dp = new int[n+1];
    //     return helperDP(n, dp);
    // }

    // private int helperDP(int n, int[] dp){
    //     if(n<=2 ) return n;

    //     if(dp[n]==0){
    //         dp[n]=helperDP(n-1, dp)+helperDP(n-2, dp);
    //     }

    //     return dp[n];
    // }
}