class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        for(int i: nums){
            if(count[i]==0) count[i]=1;
            else return i;
        }       
        return -1;
    }
}