class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //dp[i][j] = curr + min(dp[i][j+1], dp[i+1][j], dp[i+1][j+1])

        //space optimization we need only prev and curr row
        int n=triangle.size();
        int[] prev = new int[n];
        //copy last row in prev
        for(int i=0; i<n ; i++){
            prev[i]=triangle.get(n-1).get(i);
        } 

        for(int i=n-2; i>=0; i--){
            int m = triangle.get(i).size();
            int[] cur = new int[m];
            for(int j=m-1; j>=0; j--){
                cur[j]=Math.min(prev[j],prev[j+1]);
                cur[j]+=triangle.get(i).get(j);
            }
            prev=cur;
        }
        return prev[0];
    }
}