import java.util.ArrayList;

public class DFS {

    // DFS function
    public static void dfs(ArrayList<ArrayList<Integer>> graph,
                           int curr,
                           boolean vis[]) {

        // Mark current node as visited
        vis[curr] = true;

        // Print current node
        System.out.print(curr + " ");

        // Visit all neighbors
        for (int neighbor : graph.get(curr)) {

            if (!vis[neighbor]) {
                dfs(graph, neighbor, vis);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create graph
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        boolean vis[] = new boolean[V];

        // Start DFS from node 0
        dfs(graph, 0, vis);
    }
}