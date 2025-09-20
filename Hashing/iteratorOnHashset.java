//package Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class iteratorOnHashset {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it=cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for(String city :cities){
        //     System.out.println(city);
        // }

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(cities);
        System.out.println(lhs);

        TreeSet<String> tm=new TreeSet<>();
        tm.add("Delhi");
        tm.add("Mumbai");
        tm.add("Noida");
        tm.add("Bengaluru");

        System.out.println(tm);
    }
}
