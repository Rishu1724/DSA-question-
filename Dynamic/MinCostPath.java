// package Dynamic;

public class MinCostPath {
    static int findMinCost(int[][] cost){
        int m= cost.length;
        int n=cost[0].length;
        return cost[n][m];
    }
    public static void main(String[] args) {
        int[][] cost = {
            {1,2,3},
            {4,8,2,},
            {1,5,3}
        };
        System.out.println(findMinCost(cost));
    }
}
