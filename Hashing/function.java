package Hashing;

import java.util.*;
public class function {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        //Insert
        hm.put("India",100);
        hm.put("china",150);
        hm.put("Us",50);

        System.out.println(hm);

        // //get
        // int population=hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia")); //return null

        // //containsKey
        // System.out.println(hm.containsKey("India")); //true
        // System.out.println(hm.containsKey("Indonesia")); //false

        // //remove
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
