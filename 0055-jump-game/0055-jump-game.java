class Solution {
    public boolean canJump(int[] nums) {
        int length=0;
        for(int i=nums.length-2; i>=0; i--){ //last position is final
            if(nums[i]>length) length=0;
            else length++;
        }
        return length==0;
    }
}