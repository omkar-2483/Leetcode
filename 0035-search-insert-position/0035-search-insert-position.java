class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int index=0;
        while(right>=left){
            index=(left+right)/2;
            if(nums[index]==target){
                return index;
            }else if(nums[index]>target){
                right=index-1;
            }else if(nums[index]<target){
                left=index+1;
            }
        }
        if(nums[index]<target){
            return index+1;
        }else{
            return index;
        }
    }
}