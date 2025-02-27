class Solution {
    public int rob2(int[] nums) {
        //recursion include or exclude home i
        //maxSum(i) =max(nums[i]+maxSum(i-2), maxSum(i-1)) 
        // or maxSum(i)= max(nums[i]+maxSum(i+2), maxSum(i+1))

        //dp[i] stores maxSum at house i
        int[] dp = new int[nums.length];

        if(nums.length==1) return nums[0]; //if only one home
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        return dp[nums.length-1];
    }

    

    public int rob(int[] nums) {
        //space optimization
        if(nums.length==1) return nums[0]; //if only one home
        int i_2=nums[0];
        int i_1=Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            int curr = Math.max(nums[i]+ i_2, i_1);
            i_2 = i_1;
            i_1 = curr;
        }
        return i_1;

    }
}