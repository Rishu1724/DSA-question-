import java.util.*;

public class subarraysum{
    public static int Sumarray(int arr[]){
        int n = arr.length;
        int tem=0,result =0;
        for(int i =0; i<n; i++){
           int  temp=0;
            for(int j=i;j<n;j++){
                temp += arr[j];
                result +=temp;
            }
            
            
        }
        return result;

    }

    public static void main(String args[]){
         
        int arr[]={3,4,6,7,4,7,8,3};
        Sumarray(arr);
        System.out.println(Sumarray(arr));
    }
}