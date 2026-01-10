import java.util.*;

public class AbsolutePair{
    public static void main(String args[]){
        int a[] = {1,2,4};
        int b[] = {2,1,3};
        Arrays.sort(a);// remamber this it is not Array
        Arrays.sort(b);
        int minDiff =0;
        for(int i=0; i <a.length;i++){
            minDiff +=Math.abs(a[i]- b[i]);
        }
        System.out.println("min absolute diff of pairs = " + minDiff);

    }
}