import java.util.*;

public class delectcycle {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void Creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 - 1
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        // 1 - 2
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        // 1 - 3
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));

        // 2 - 3
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
    }

    static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean[] vis, int currt, int parnt) {
        vis[currt] = true;
        for (int i = 0; i < graph[currt].size(); i++) {
            Edge e = graph[currt].get(i);

            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, currt)) {
                    return true;
                }

            } else if (vis[e.dest] && e.dest != parnt) {
                return true;
            }

        }
        return false;

    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        Creategraph(graph);
        System.out.print(detectCycle(graph));
    }
}
