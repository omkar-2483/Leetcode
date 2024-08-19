class Solution {
    public boolean isMonotonic(int[] nums) {
        int l=0;
        while(l<nums.length-1 && nums[l]==nums[l+1]) l++;
        if(l==nums.length-1) return true;
        if(nums[l]<nums[l+1]){
            for(int i=l+1; i<nums.length-1;i++){
                if(nums[i]>nums[i+1]) return false;
            }
        }else{
            for(int i=l+1; i<nums.length-1;i++){
                if(nums[i]<nums[i+1]) return false;
            }
        }

        return true;
    }
}