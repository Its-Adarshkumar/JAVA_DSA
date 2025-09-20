import java.util.*;

public class stackUsingDP {
    static class stack{
        Deque<Integer>dp=new LinkedList<>();

        public void push(int data){
            dp.addLast(data);
        }

        public int pop(){
            return dp.removeLast();
        }

        public int peek(){
            return dp.getLast();
        }
    }
    public static void main(String[] args) {
       Stack s=new Stack(); 
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek:" +s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
