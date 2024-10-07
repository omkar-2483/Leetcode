class Solution {
    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    //     for(int i=0; i<nums.length; i++){
    //         pq.add(nums[i]);
    //     }
    //     int largest=0;
    //     for(int i=0; i<k; i++){
    //         largest = pq.remove();
    //     }
    //     return largest;
    // }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}