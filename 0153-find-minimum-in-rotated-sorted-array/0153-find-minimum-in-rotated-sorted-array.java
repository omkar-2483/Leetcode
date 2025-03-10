class Solution {
    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length-1);
    }
    private int binarySearch(int[] nums, int start, int end){
        if(start==end || nums[start] < nums[end]) return nums[start];
        int mid = (start+end)/2;
        if(nums[mid] < nums[start]) return binarySearch(nums, start, mid);
        else return binarySearch(nums, mid+1, end);
    }
}