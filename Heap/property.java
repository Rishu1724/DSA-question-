import java.util.*;

public class property {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(8);
        System.out.println("this is the added value of the queue" +pq);
        pq.remove(3);
                System.out.println("this is the added value of the queue" +pq);

    }
}
