import java.util.*;

public class Creategraph {
// edge class 
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Create Graph
    static void createGraph(ArrayList<Edge> graph[]) {

        // Initialize ArrayList for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (Undirected Graph Example)

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // Print Graph
    static void printGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {// this is the length of the graph bcs it is a array 
            System.out.print("Vertex " + i + " -> ");
            for (int j = 0; j < graph[i].size(); j++) {// this is the arrayList edge
                Edge e = graph[i].get(j);
                System.out.print("(" + e.dest + ", wt=" + e.wt + ") ");
            }
            System.out.println();
        }
    }
    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean [graph.length];
        q.add(0);// source = 0 we are taking 
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+"  ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
                System.out.println();
            }
        }
    }
    

    public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]){
        // visit
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i =0; i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);// getting every edge ;
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);// yaha pe curr ko e.dest kar rhe hai;
            }
        }
    }

    public static void main(String args[]) {
        int v = 7;// number of node
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        printGraph(graph);
        bfs(graph);
        dfs(graph,0,new boolean[v]);
    }
}