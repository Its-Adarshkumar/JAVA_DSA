import java.util.*;
public class functions {
    public static void printHelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        //return 2; use int as void
    }
    public static int calculateSum(int a, int b){  // formal parameter
        int sum= a+b;
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       printHelloworld();
        int a=sc.nextInt();
        int b=sc.nextInt();
       int sum= calculateSum(a,b);// Actual argument or Actual parameter
        System.out.println("Sum is: "+ sum);
    }
}
