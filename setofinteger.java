 import java.util.*;
 public class setofinteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choose;
        int number;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.print("Enter the number=");
             number=sc.nextInt();
            if(number%2==0){
                evensum+=number;
            }
            else{
                oddsum+=number;
            }
            System.out.println("Do you want to add further no. if yes choose 1, if not choose 0");
            choose=sc.nextInt();
        }while(choose==1);
        System.out.println("Even sum is " + evensum);
        System.out.println("Odd sum is " + oddsum);
    }
}
