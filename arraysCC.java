import java.util.*;
public class arraysCC {
    public static void main(String[] args) {
        int marks[]=new int[50];

      //  int numbers={1,2,3};
        
      //  String fruits[]= {"apple","mango","orange"};
      Scanner sc = new Scanner(System.in);
     marks[0]=sc.nextInt(); //phy
     marks[1]=sc.nextInt(); //chem
     marks[2]=sc.nextInt(); //maths

     System.out.println("Phy = "+ marks[0]);
     System.out.println("Chem = "+ marks[1]);
     System.out.println("Maths = "+ marks[2]);

     System.out.println("Length of array= "+ marks.length);
    }
}
