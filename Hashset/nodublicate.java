import java.util.*;

public class nodublicate {
public static void main(String args[]){
    HashSet<Integer> hs = new HashSet<>();
    hs.add(2);
    hs.add(3);
    hs.add(4);
    hs.add(4);
    hs.add(9);
    hs.add(9);
    hs.add(9);
    

    System.out.println("this is the HashSet value" +hs);
    // System.out.println(set.size());
    // i am asseccing the Hashset value by the enhence for loop
    for(Integer hi: hs){
        System.out.println(hi);
    }

    }

}
