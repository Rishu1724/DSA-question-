import java.util.*;

public class BFSExample {

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
        
        boolean[] visited = new boolean[graph.size()];// it will store the visited value of the node
        Queue<Integer> queue = new LinkedList<>();

        // Mark start node as visited and add to queue
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            // Visit all neighbours
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int V = 5; // number of vertices
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        System.out.println("BFS Traversal:");
        bfs(graph, 0);
    }
}
