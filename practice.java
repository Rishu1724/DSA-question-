public class practice {

    public static void sumArray(int[] arr) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            int Sum = 0;
            for (int j = 0; j < m; j++) {
                 Sum = (i + j) % m;
            }
            System.out.println(Sum);
            

        }
        System.out.println("this is the value of modulo =  " + m);

    }

    public static void main(String args[]) {
        int modulo = 1% 5;// it will give the remainder of the numbers
        int div = 1 / 2; // it will give the quetiont of the number

        int n = Math.max(10, 20);
        int[] arr = { 1,2,3,4,5 };
        int[] rishu= {4,3,6,7,3,1};
        r =Array.sort(rishu);
        System.out.println("this is the value of modulo =  " + modulo);
        // System.out.println("this is the value of modulo =  " + div);
        // System.out.println("this is the value of modulo =  " + m);
        sumArray(arr);

    }
}