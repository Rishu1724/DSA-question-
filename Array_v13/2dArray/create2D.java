
import java.util.Scanner;



public class create2D {
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc  = new Scanner(System.in);
        System.out.println("give the elemente of the matrix");
        int n = 3; int m = 3;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(arr[i][j] +" ");
                 
    }
     
}
System.out.println();
}
}
