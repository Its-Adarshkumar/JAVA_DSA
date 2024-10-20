import java.util.*;

public class sumofNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int Sum=0;
        int i=1;
        while(i<=n){
         Sum+=i;
         i++;
        }
        System.out.println("Sum is "+ Sum);
    }
}
