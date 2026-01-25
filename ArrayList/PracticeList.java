import java.util.ArrayList;
public class PracticeList{
    public static void main(String args[]){
        // Integer in= Integer.valueOf(4);
        // System.out.println(in);
        // int rishu= 1724;
        // System.out.println(+rishu);
        int[] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> slist = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        slist.add("L");
        slist.add("O");
        slist.add("V");
        slist.add("E");
        slist.add("U");
        // list.add(1,3);
        list.remove(Integer.valueOf(4));
        list.remove(1);// this is the index
        for(int i =0; i<list.size();i++){
            System.out.println(" "+list.get(i)+" ");
            

        }
        for(int j=0;j<slist.size();j++){
            System.out.println(slist.get(j));
        }
        // System.out.println(slist.CharAt(j));

    }

}