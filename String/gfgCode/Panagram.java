import java.util.*;

public class Panagram {

    static boolean checkprogram(String s) {
        s = s.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false; // this letter not found → not a pangram
            }
        }
        return true; // all letters found
    }

    public static void main(String arg[]) {
        String s = "The quick brown fox jumps over the lazy dog";

        if (checkprogram(s)) {
            System.out.println("true");
        } else { 
            System.out.println("false");
        }
    }
}
