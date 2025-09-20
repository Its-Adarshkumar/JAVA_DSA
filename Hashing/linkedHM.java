package Hashing;

import java.util.*;

public class linkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm=new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china",150);
        lhm.put("us", 50);

        System.out.println(lhm);

        //compare HashMap with LinkedHashMap

        HashMap<String , Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("china",150);
        hm.put("us", 50);

        System.out.println(hm);
    }
}
