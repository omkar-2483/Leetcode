class Solution {
    class Point implements Comparable<Point>{
        int dist;
        int idx;

        public Point(int dist, int idx){
            this.dist=dist;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.dist-p2.dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq= new PriorityQueue<>();
        for(int i=0 ;i<points.length; i++){
            int dist = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new Point(dist, i));
        }
        int[][] ans=new int[k][2];
        for(int i=0; i<k; i++){
            int idx= pq.remove().idx;
            ans[i]=points[idx];
        }
        return ans;
    }
}