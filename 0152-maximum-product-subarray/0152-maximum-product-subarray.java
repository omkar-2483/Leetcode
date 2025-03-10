class Solution {
    //brute force
    public int maxProduct2(int[] nums) {
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
    public int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1;
        int result = Integer.MIN_VALUE;
        int n=nums.length;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
            prefix *= nums[i];
            suffix *= nums[n-1-i];
            result = Math.max(result,Math.max(prefix, suffix));
        }
        return result;

    }
}