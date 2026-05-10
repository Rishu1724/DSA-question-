// package Dynamic;
public class Knapsack {
    public static int kanpSack(int val[], int wt[], int w, int n) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) { // iteam ka index wo kaha hai
            int ans1 = val[n - 1] + kanpSack(val, wt, w - wt[n - 1], n - 1);
            int ans2 = kanpSack(val, wt, w, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return kanpSack(val, wt, w, n - 1);// when wt is more 
        }
    }
    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };// value 
        int wt[] = { 2, 5, 1, 3, 4 }; // weight 
        int w = 7;// capacity 
        int n = val.length;
        System.out.println(kanpSack(val, wt, w,n));
    }
}