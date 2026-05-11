
import java.util.ArrayList;

public class DFS {
    public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]){

    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int V=5;
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        
    }
}
