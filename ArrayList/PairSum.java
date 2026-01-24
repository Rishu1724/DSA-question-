// package ArrayList;

import java.util.ArrayList;
public class PairSum {
    public static boolean SumPair(ArrayList<Integer> list, int target){
        for(int i =0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)== target){
                    return true;
                }
                
            }
        }
        return false;
      
    }
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target=67;
        System.out.println(SumPair(list,target));

    }
}