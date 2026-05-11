import java.util.*;

public class BFSExample {

    public static void bfs(ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++){
            if(!visited[i]){
                bfsutil(graph, i, visited);
            }
        }
    }

    public static void bfsutil(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited) {
        
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        System.out.println("BFS Traversal:");
        bfs(graph);
    }
}