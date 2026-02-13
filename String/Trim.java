import java.util.Arrays;

public class Trim {
    public static void main(String args[]){
        String s = "     hello      world";
        System.out.println(s);

        String[] m = s.trim().split("\\s+");

        System.out.println(Arrays.toString(m));
    }
}
