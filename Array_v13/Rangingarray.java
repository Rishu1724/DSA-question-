
public class Rangingarray {
    public static void rangingArr(int[] arr)   {
        int n = arr.length;
        for(int i =0; i<n ;i++){
            for(int j=0; j<n; j++){
                // ye logic thoda ache se samjhna hai 
                
                if(arr[j]== i){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }


            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] != i){
                arr[i] = -1;
            }
        }
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String args[]){
    int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
    rangingArr(arr);

    }
}
