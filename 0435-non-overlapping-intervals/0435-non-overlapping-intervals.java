class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0])?a[1]-b[1]:a[0]-b[0]);

        int count=0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] < intervals[i-1][1]){
                count++;
                intervals[i][1]=Math.min(intervals[i][1] ,intervals[i-1][1]);
            }
        }
        return count;
    }
}