class Solution {

    //prefix sum approach
    // public int maxSubArray(int[] nums) {
    //     int[] prefixSum = new int[nums.length];
    //     //calculate prefix sum of each index
    //     prefixSum[0]=nums[0];
    //     for(int i=1; i<nums.length; i++){
    //         prefixSum[i] = prefixSum[i-1]+nums[i];
    //     }

    //     int maxSum=Integer.MIN_VALUE;
    //     // for all posible subarrays
    //     for(int i=0; i<prefixSum.length; i++){
    //         for(int j=i; j<prefixSum.length; j++){
    //             int currSum = i==0 ? prefixSum[j]: prefixSum[j]-prefixSum[i-1];
    //             maxSum = Math.max(currSum, maxSum);
    //         }
    //     }

    //     return maxSum;
    // }

    //kadane's algorithms
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<nums.length; i++){
            currSum += nums[i];
            if(currSum < 0) currSum=0;
            maxSum = Math.max(maxSum, currSum);
        }

        //if all nums are -ve
        Arrays.sort(nums);
        if(nums[nums.length-1] < 0) return nums[nums.length-1];

        return maxSum;
    }
}