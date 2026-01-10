import java.util.*;

public class Compression {

    // public static String compression(String str) {
    //     StringBuilder newStr = new StringBuilder();

    //     for (int i = 0; i < str.length(); i++) {
    //         int count = 1;

    //         // Count occurrences of the same character
    //         while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    //             count++;
    //             i++;
    //         }

    //         newStr.append(str.charAt(i));

    //         if (count > 1) {
    //             newStr.append(count);
    //         }
    //     }

    //     return newStr.toString();
    // }

    public static void main(String[] args) {
        // String str = "aaabbcddddd";
        // System.out.println(compression(str)); // Output: a3b2cd5
        StringBuilder sr = new StringBuilder("rihsu");
         sr.append("hello");
         int cap =sr.capacity();
         System.out.println(" "+cap);

    }
}
