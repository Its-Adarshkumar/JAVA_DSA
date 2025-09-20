import java.util.*;
public class ternary {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int number=sc.nextInt();
            String type=(number %2==0)?"Even":"Odd";
            System.out.println(type);
    }
    }
}
