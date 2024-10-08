class Solution {
    class Row implements Comparable<Row>{
        int sold;
        int idx;

        public Row(int sold, int idx){
            this.sold=sold;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.sold==r2.sold) return this.idx-r2.idx;
            else return this.sold-r2.sold;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq= new PriorityQueue<>();
        int[] res = new int[k];

        for(int i=0; i<mat.length; i++){
            int sold=0;
            while(sold<mat[i].length && mat[i][sold]==1) sold++;
            pq.add(new Row(sold,i));
        }

        for(int i=0; i<k; i++){
            res[i]=pq.remove().idx;
        }
        return res;
    }
}