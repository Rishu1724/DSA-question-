import java.util.*;

public class TopologicalDAG {
     static class Edge {
        int src;
        int dest;
      

        public Edge(int s, int d) { // this is the constructor ;
            this.src = s;
            this.dest = d;
        }

    }
    static void createGraph(ArrayList<Edge> graph[]) {

        // Initialize ArrayList for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (Undirected Graph Example)

        graph[0].add(new Edge(2, 3));
        graph[0].add(new Edge(3, 1));

        graph[1].add(new Edge(4, 0));
        graph[1].add(new Edge(5, 0));

        graph[2].add(new Edge(5, 0));
        
    }
    public static void topSort(ArrayList<Edge> graph[]){
        boolean[] vist= new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vist[i]){
                toputil(graph,i,vist,s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void toputil(ArrayList<Edge>[] graph, int currnt, boolean[] vist, Stack<Integer> s){
        vist[currnt]=true;
        for(int i=0;i<graph[currnt].size();i++){
            Edge e = graph[currnt].get(i);
            if(!vist[e.dest]){
                toputil(graph, e.dest, vist, s);
            }
        }
        s.push(currnt);
    }


    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);
        topSort(graph);

    }

}
