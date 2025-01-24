class Solution {
static class Edge {
    int src, dest;
    
    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public static ArrayList<Edge>[] buildGraph(int[][] edges, int V) {
    // Create an adjacency list of ArrayList<Edge>
    ArrayList<Edge>[] graph = new ArrayList[V];
    for (int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }

    // Populate the adjacency list
    for (int[] edge : edges) {
        int src = edge[0];
        int dest = edge[1];
        
        // Add edges (both directions for an undirected graph)
        graph[src].add(new Edge(src, dest));
        graph[dest].add(new Edge(dest, src));
    }

    return graph;
}

//function to check if there is path between two nodes
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean visited[]){
        if(src==dest) return true;
        visited[src]=true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e= graph[src].get(i);
            if(! visited[e.dest] && hasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    } 
    


    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Edge>[] graph=buildGraph(edges, n);
        return hasPath(graph, source, destination, new boolean[n]);
    }
}