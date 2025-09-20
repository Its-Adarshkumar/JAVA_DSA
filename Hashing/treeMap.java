package Hashing;

import java.util.*;
public class treeMap {
    public static void main(String[] args) {
        TreeMap<String , Integer> tm=new TreeMap<>();
        tm.put("India", 100);
        tm.put("china",150);
        tm.put("us", 50);

        System.out.println(tm);

        //compare TreeMap with HashMap

        HashMap<String , Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("china",150);
        hm.put("us", 50);

        System.out.println(hm);
    }
}
