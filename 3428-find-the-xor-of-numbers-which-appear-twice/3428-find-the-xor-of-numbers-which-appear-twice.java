class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[51];
        for(int i=0; i<nums.length;i++)count[nums[i]]++;
        int ans=0;
        for(int i=0; i< 51;i++){
            if(count[i]==2) ans= ans^i;
        }
        return ans;
    }
}