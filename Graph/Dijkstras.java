import java.util.*;

public class Dijkstras {

    // Edge class
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Create Directed Weighted Graph
    static void createGraph(ArrayList<Edge> graph[]) {

        // Initialize every vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 3, 5));
    }
    static class pair implements Comparable<pair>{
        int n ;
        int path;
        public pair(int n , int path){
            this.n=n;
            this.path=path;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];

        // initialize the graph
        for (int i = 0; i < graph.length; i++) {
            dist[i] = Integer.MAX_VALUE;
            
        }}
    }

    // Print Graph
    static void printGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {

            System.out.print("Vertex " + i + " -> ");

            for (Edge e : graph[i]) {
                System.out.print(
                    "(" + e.dest + ", wt=" + e.wt + ") "
                );
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int v = 6;

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        printGraph(graph);
    }
}