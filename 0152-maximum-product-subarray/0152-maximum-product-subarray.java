class Solution {
    //brute force
    public int maxProduct(int[] nums) {
        int result=nums[0];
        for(int i=0; i<nums.length; i++){
            int curProd = nums[i];
            for(int j=i+1; j<nums.length; j++){
                result = Math.max(result, curProd);
                curProd*= nums[j];
            }
            result = Math.max(result, curProd);
        }
        return result;
    }

//optimised
    public int maxProduct2(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            prefix = prefix * nums[i];
            max = Math.max(max,prefix);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (suffix == 0) {
                suffix = 1;
            }
            suffix = suffix * nums[i];
            max = Math.max(max,suffix);
        }
        return max;

    }
}