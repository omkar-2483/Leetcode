class Solution {
    //using prefic product
    public int maxProduct(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            pref[i] =(pref[i-1]!=0) ? pref[i-1]*nums[i]: nums[i];
        }

        int maxProd=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int curProd = (i==0)? pref[j]: ((pref[i-1]==0) ? pref[j]: pref[j] / pref[i-1]);
                maxProd = Math.max(maxProd, curProd);
                if(pref[j]==0) break;
            }
        }
        return maxProd;
    }
}