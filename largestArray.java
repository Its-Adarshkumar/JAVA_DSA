import java.util.*;
public class largestArray {
    public static int getlargest(int numbers[]){
        int largest= Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smaller>numbers[i]){
                smaller=numbers[i];
            }
        }
        System.out.println("Smallest value ="+smaller);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest number= "+ getlargest(numbers));
       
    }
}
