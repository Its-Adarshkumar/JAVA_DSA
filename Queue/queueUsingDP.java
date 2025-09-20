import java.util.*;
public class queueUsingDP {
    static class Queue{
        Deque<Integer>dp=new LinkedList<>();

        public void add(int data){
            dp.addLast(data);
        }

        public int remove(){
            return dp.removeFirst();
        }

        public int peek(){
            return dp.getFirst();
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek:"+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
