class Solution {
    public int[][] merge(int[][] intervals) {
        //sort all intervals
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        int[][] ans = new int[intervals.length][2];
        ans[0]=intervals[0];
        int count =1; 

        for(int i=1; i<intervals.length; i++){
            if(ans[count-1][1]>=intervals[i][0]){
                ans[count-1][1] = Math.max(ans[count-1][1],intervals[i][1]);
            }else{
                ans[count] = intervals[i];
                count++;
            }
        }

        int[][] ans2 = new int[count][2];
        for(int i=0; i<count; i++){
            ans2[i] = ans[i];
        }

        return ans2;

    }
}