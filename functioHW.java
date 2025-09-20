import java.util.*;
public class functioHW {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number= ");
        int a=sc.nextInt();
        System.out.println(isEven(a));
        if(isEven(a)){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
