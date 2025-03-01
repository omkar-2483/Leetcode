class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=n; i>=1; i--){  //i=no of papers cited at least citation[n-i] times
            if(i<=citations[n-i]) return i;
        }
        return 0;
    }
}