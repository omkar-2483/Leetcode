import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0, n = intervals.length;

        // Add all intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i++]);
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        list.add(newInterval); // Add merged interval

        // Add remaining intervals
        while (i < n) {
            list.add(intervals[i++]);
        }

        return list.toArray(new int[0][]);
    }
}
