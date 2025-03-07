class Solution {
    public boolean canPartition(int[] nums) {
        // return helper(nums, 0, 0);
        //using dp
        // arr can be divide into equal subsets if we can find subset sum = totalSum/2   
        int totalSum=0;
        for(int num: nums) totalSum+=num;
        if((totalSum % 2) != 0) return false;
        return isSubsetSum(nums, totalSum/2);
    }

    private boolean isSubsetSum(int[] arr, int target){
        //targetFound[tar] = is subster found with sum==tar
        boolean[] targetFound = new boolean[target+1];  //tar = 0 to target
        targetFound[0]=true; //target 0 can be found with empty subset

        for(int num: arr){
            for(int tar=target; tar>=num; tar--){
                targetFound[tar] = targetFound[tar] || targetFound[tar-num];
            }
        }

        return targetFound[target];
    }


    // recursion - if we use only one sum
    private boolean helper(int[] nums, int i, int sum){
        if(i==nums.length){
            return sum==0;
        }

        if(helper(nums, i+1, sum+nums[i])==true){
            return true;
        }else if(helper(nums, i+1, sum-nums[i])==true){
            return true;
        }else{
            return false;
        }
    }
}