package Heaps;

import java.util.*;
public class implement {

    public static void main(String[] args) {
        PriorityQueue<Integer>pq =new PriorityQueue<>(Comparator.reverseOrder());
        //using comaparator we reverse the pq

        pq.add(3); //O(log(n))
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(log n)
        }
     
    }
}
