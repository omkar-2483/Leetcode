class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            min=Math.min(min, nums[i]);
            max=Math.max(max, nums[i]);
        }
        int i=0;
        while(i<nums.length && (nums[i]==min || nums[i]==max)) i++;
        if(i==nums.length) return -1;
        return nums[i];
    }
}