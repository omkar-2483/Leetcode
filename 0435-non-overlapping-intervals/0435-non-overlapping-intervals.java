class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]); // Sort by end time

        int count = 0;
        int prevEnd = intervals[0][1]; // Track last non-overlapping interval's end time

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) { // Overlapping case
                count++; // Remove the current interval
            } else {
                prevEnd = intervals[i][1]; // Update prevEnd to the non-overlapping interval
            }
        }
        return count;
    }
}