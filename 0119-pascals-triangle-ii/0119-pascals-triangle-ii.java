class Solution {
    public List<Integer> getRow(int rowIndex) {
        // in pascal triagle tri[i][j]= ncr(i,j)
        List<Integer> row = new ArrayList<>();
        for(int i=0; i<= rowIndex; i++){
            row.add((int)ncr(rowIndex, i));
        }
        return row;

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