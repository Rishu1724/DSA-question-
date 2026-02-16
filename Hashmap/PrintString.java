// package Hashmap;

import java.util.*;


// public static class 

public class PrintString {
    public static void main(String[] args) {

        // HashMap<Integer, String> hm = new HashMap<>();
        // hm.put(17, "mybday");
        // hm.put(21,"hello");
        // hm.put(23, " hello baby");hm.put(1,"ky hai hai");
        // hm.remove(1);


        // System.out.println(hm); 
        HashMap<String,Integer> map= new HashMap<>();
        map.put("rishu",1);
        map.put("kumar",2);
        map.put("kaise",3);
        map.put("ho",4);
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println("key:"+e.getKey()+"value"+e.getValue());
        }
    }
}
