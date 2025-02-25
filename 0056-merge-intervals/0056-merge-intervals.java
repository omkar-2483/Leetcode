class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a, b) -> (a[0] == b[0])?a[1]-b[1]:a[0]-b[0]);

        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(intervals[0]);
        int size=1;

        for(int[] interval: intervals) {
            int[] top = arr.get(size-1);
            if(top[1]>=interval[0]) {
                arr.get(size-1)[1] = Math.max(top[1], interval[1]);
            } else {
                arr.add(interval);
                size++;
            }
        }
        int[][] ans = new int[size][2];
        for(int i=0; i<size; i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}