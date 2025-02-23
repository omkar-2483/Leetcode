class Solution {
    public void nextPermutation(int[] nums) {
        int breakIdx=nums.length-2;
        while(breakIdx >-1 && nums[breakIdx] >= nums[breakIdx+1]) breakIdx--;

        //if break index not found, array is osrted in decreasing order
        if(breakIdx==-1){
            Arrays.sort(nums);
            return;
        }

        // if break index found, find num just greater than break index num
        int k=nums.length-1;
        while(nums[k] <= nums[breakIdx]) k--;
        //swap
        int temp=nums[breakIdx];
        nums[breakIdx] = nums[k];
        nums[k] = temp;

        //sort nums[breakIdx, last]
        Arrays.sort(nums, breakIdx+1, nums.length);

    }
}