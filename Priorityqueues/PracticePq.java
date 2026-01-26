// package Priorityqueues;
import java.util.PriorityQueue;

public class PracticePq {
    public static void main(String args[]){
        PriorityQueue<Integer> pd = new PriorityQueue<>();
        pd.add(2);
        pd.add(7);
        pd.add(4);
        pd.add(5);
        pd.add(3);
        while(!pd.isEmpty()){
            System.out.println(pd.peek());
            pd.remove();
        }

    }
}