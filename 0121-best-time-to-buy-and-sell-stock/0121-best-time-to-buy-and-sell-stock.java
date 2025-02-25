class Solution {
    // public int maxProfit(int[] prices) {
    //      //brute force
    //     int maxP = Integer.MIN_VALUE;
    //      for(int i=0; i<prices.length-1; i++){
    //         for(int j=i+1; j<prices.length; j++){
    //             int curP = prices[j]-prices[i];
    //             maxP = Math.max(maxP, curP);
    //         }
    //     }
    //     return maxP<0 ? 0: maxP;
    // }

    //optimal solution
    public int maxProfit(int[] prices) {
        int minV=prices[0];  //min value to buy
        int maxP=0;

        for(int i=1; i<prices.length; i++){
            int curP = prices[i]-minV;
            maxP = Math.max(maxP, curP);
            minV = Math.min(minV, prices[i]);
        }
        return maxP;
    }
}