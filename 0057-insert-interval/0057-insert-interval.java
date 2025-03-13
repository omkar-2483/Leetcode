class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        if (n == 0) {
            return new int[][] { newInterval };
        }
        if(newInterval[1] < intervals[0][0]){
            int[][] ans = new int[n+1][2];
            ans[0] = newInterval;
            for(int i=1; i<=n; i++){
                ans[i] = intervals[i-1];
            }
            return ans;
        }
        if(newInterval[0] > intervals[n-1][1]){
            int[][] ans = new int[n+1][2];
            for(int i=0; i<n; i++){
                ans[i] = intervals[i];
            }
            ans[n] = newInterval;
            return ans;
        }

        int first = bSearch(intervals, newInterval[0], 0, n - 1);
        int second = bSearch(intervals, newInterval[1], 0, n - 1);
        List<int[]> list = new ArrayList<>();
        if (first == -1 && second==-1){
            int i=0;
            while(i< n && intervals[i][1] < newInterval[0]){
                list.add(intervals[i]);
                i++;
            }
            while( i< n &&intervals[i][1] < newInterval[1]) i++;
            list.add(newInterval);
            while(i < n){
                list.add(intervals[i]);
                i++;
            }
        }else if(first == -1){
            int i=0;
            while(i < n && intervals[i][1] < newInterval[0]){
                list.add(intervals[i]);
                i++;
            }
            i=second;
            newInterval[1] = intervals[i][1];
            list.add(newInterval);
            i++;
            while(i < n){
                list.add(intervals[i]);
                i++;
            }
        }else if(second == -1){
            int i=0;
            while(i < first){
                list.add(intervals[i]);
                i++;
            }
            newInterval[0] = intervals[i][0];
            list.add(newInterval);
            while(i< n && intervals[i][1] < newInterval[1]) i++;
            while(i < n){
                list.add(intervals[i]);
                i++;
            }
        }else{
            int i=0;
            while(i < first){
                list.add(intervals[i]);
                i++;
            }
            newInterval[0] = intervals[i][0];
            i=second;
            newInterval[1] = intervals[i][1];
            list.add(newInterval);
            i++;
            while(i < n){
                list.add(intervals[i]);
                i++;
            }
        }
        return list.toArray(new int[0][]);

    }

    private int bSearch(int[][] intervals, int key, int start, int end) {
        if(end < 0 || start >= intervals.length) return -1;
        if(key < intervals[start][0] || key > intervals[end][1]) return -1;
        int mid = (start + end) / 2;
        if (key >= intervals[mid][0] && key <= intervals[mid][1]) {
            return mid;
        } else if (key < intervals[mid][0]) {
            return bSearch(intervals, key, start, mid - 1);
        } else {
            return bSearch(intervals, key, mid + 1, end);
        }
    }
}