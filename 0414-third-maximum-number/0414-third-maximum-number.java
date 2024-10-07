class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max=nums.length-1;
        for(int i=0 ; i<2 ;i++){
            while(max>0 && nums[max-1]==nums[max]) max--;
            max--;
        }
        if(max<0) return nums[nums.length-1];
        else return nums[max];
    }
}