class Solution {
    // class to store Edge
    static class Edge{
        int src, dest, wt;

        public Edge(int s, int d, int w){
            this.src =s;
            this.dest =d;
            this.wt =w;
        }
    }

    //funcion to create graph
    public static void createGraph(int[][] flights, ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            graph[flights[i][0]].add(new Edge(flights[i][0], flights[i][1], flights[i][2]));
        }
    }

    static class Info{
        int vertex, cost, stops;
        public Info(int v, int c, int s){
            this.vertex = v;
            this.cost =c;
            this.stops = s;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);

        //initialize dist array
        int[] dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(i!=src) dist[i]=Integer.MAX_VALUE;
        }

        //Queue to store info
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0,0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops>k) break;

            for(int i=0; i<graph[curr.vertex].size(); i++){
                Edge e = graph[curr.vertex].get(i);

                //condition
                if(curr.cost+e.wt < dist[e.dest]){
                    dist[e.dest] = curr.cost+e.wt;
                    q.add(new Info(e.dest, dist[e.dest], curr.stops+1));
                }
            }
        }

        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }

    }
}