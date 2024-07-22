class Solution {
    public int numIdenticalPairs(int[] nums) {
        int good=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]) good++;
        //     }
        // }
        
        //in one loop using array
        int[] count=new int[101];
        for(int num: nums){
            good+=count[num]++;
        }

        return good;
    }
}