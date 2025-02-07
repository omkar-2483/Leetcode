class Solution {
    public int minCostConnectPoints(int[][] points) {
        int V = points.length;
        int graph[][] = new int[V][V];

        //create graph
        for(int i=0; i < V; i++){
            for(int j=0; j < V; j++){
                graph[i][j]= Math.abs(points[i][0]-points[j][0])+ Math.abs(points[i][1]-points[j][1]);
            }
        }

        //use prims algorithm
        boolean visited[] = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int cost=0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.vertex]){
                visited[curr.vertex]=true;
                cost += curr.wt;
                for(int i=0; i<V; i++){
                    if(graph[curr.vertex][i]!=0){
                        pq.add(new Pair(i, graph[curr.vertex][i]));
                    }
                }
            }
        }

        return cost;
    }
    static class Pair implements Comparable<Pair>{
        int vertex;
        int wt;

        public Pair(int v, int w){
            this.vertex = v;
            this.wt =  w;
        }

        @Override
        public int compareTo(Pair p2){
            return this.wt-p2.wt;
        }
    }
}