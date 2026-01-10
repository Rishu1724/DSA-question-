import java.util.*;

public class arrayListReverse {

    public static void main(String args[]) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        System.out.println("All the numbers of the list:");

        for (int i = 0; i < List.size(); i++) {
            System.out.println("list get " + List.get(i));
        }
    }
}
