class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0], nums[1]);
        }

        //curr = max(i_1, nums[i]+i_2)
        //either nums[0] or nums[n-1] can be selected--> two cases
        //case 1--> nums[0] to nums[n-2]
        int i_2=nums[0];
        int i_1=Math.max(nums[0], nums[1]);

        //case 2 --> nums[1] to nums[n-1]
        int j_2=nums[1];
        int j_1=Math.max(nums[1], nums[2]);

        for(int i=2; i<n-1; i++){ //for 2nd index home to (n-2)th index home
           int curr1 = Math.max(i_1, nums[i]+i_2); //case 1
           i_2 = i_1;
           i_1=curr1;

           int curr2 = Math.max(j_1, nums[i+1]+j_2); //case 2
           j_2=j_1;
           j_1=curr2;
        }
        return Math.max(i_1, j_1); //max of two cases

    }
}