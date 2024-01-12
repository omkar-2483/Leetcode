class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        int prev=nums[0];
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                k--;
            }else{
                nums[index]=nums[i];
                prev=nums[index];
                index++;
            }
        }
        return k;
    }
}