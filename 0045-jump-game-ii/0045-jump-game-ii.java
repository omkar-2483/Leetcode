class Solution {
    public int jump(int[] nums) {
        //brute force
    //    return findMin(nums, 0);

       //using dp--> dp[i] = 1+ dp[i+k] from k in(1,nums[i])
       int n=nums.length;
       int[] dp = new int[n];  //dp[i] stores min jumps from i
       dp[n-1]=0;
       for(int i =n-2; i>=0; i--){
          if(nums[i]==0) dp[i]=10000;
          else{
              int min=10000;
              for(int k=nums[i]; k>0; k--){
                if(i+k >= n) continue;
                min=Math.min(min, dp[i+k]);
              }
              dp[i]=1+min;
          }
       }
       return dp[0];
    }
    

    // private int findMin(int[] nums, int idx){
    //     if(idx==nums.length-1) return 0;

    //     int minJumps=1000;

    //     if(idx>=nums.length || nums[idx]==0) return minJumps;
    //     for(int i=nums[idx]; i>0; i--){
    //         minJumps = Math.min(minJumps, findMin(nums, idx+i));
    //     }
    //     return 1+minJumps;
    // }
}