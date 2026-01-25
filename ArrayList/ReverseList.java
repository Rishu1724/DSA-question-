
import java.util.ArrayList;

public class ReverseList {
    // input [1,2,3,4,5]
    //output [5,4,3,2,1]
    public static void reverseList(ArrayList<Integer> list){
    //     int i =0;
    //     int j=list.size()-1;
        int n = list.size();
    //     for(i =0 ; i<n;i++){
    //         for(j=n; j>n; j--){

    //         }
    //     }
    // }
    int i=0;
    int j=n;

    while(i<j){
        Integer temp = Integer.valueOf(list.get(i));


    }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        reverseList(list);
    }
}
