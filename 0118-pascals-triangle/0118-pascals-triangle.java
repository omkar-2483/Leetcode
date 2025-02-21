class Solution {
    public List<List<Integer>> generate(int numRows) {
        // in pascal triagle tri[i][j]= ncr(i,j)
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<=i; j++){
                ans.get(i).add((int) ncr(i,j));
            }
        }
        return ans;
    }

    private long ncr(int n, int r){
        long res=1;
        for(int i=0; i<r; i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}