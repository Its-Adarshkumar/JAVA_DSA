import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer>dp=new LinkedList<>();
        dp.addFirst(1);// 1
        dp.addFirst(2);//2 1
        dp.addLast(3);// 2 1 3
        dp.addLast(4);// 2 1 3 4
        System.out.println(dp);
        dp.removeLast();
        System.out.println(dp);

        System.out.println("First elemrnt:" + dp.getFirst());
        System.out.println("Last elemrnt:" + dp.getLast());
    }
}
