import java.util.*;
// arrayList operation performed here
public class arrayListop {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("this is the arraylist" +al);
        // adding the elements in the arrayList 
        al.add(12);
        System.out.println(al);// this is the important Print properly 
        /* this is how we have to print the value  */
        al.add(1,17);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
       int hello[] ar=  toArray(al);
       System.out.println(ar);
    }
}
