class Solution {
    public int rob(int[] nums) {
        //recursion
        //maxSum(i) =nums[i]+ max(maxSum(i+2), maxSum(i+3)) 

        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        if(n==3) return Math.max(nums[0]+nums[2], nums[1]);

        //dp[i] stores maxSum at house i
        int[] dp = new int[n];
        dp[n-1]=nums[n-1];
        dp[n-2]=nums[n-2];
        dp[n-3]=nums[n-3]+nums[n-1];

        for(int i=n-4; i>=0; i--){
            dp[i]=nums[i]+Math.max(dp[i+2], dp[i+3]);
        }
        return Math.max(dp[0], dp[1]);
    }
}