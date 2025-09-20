import java.util.*;
public class strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
      
        //String fullName="Adarsh singh";
       // System.out.println(fullName.length());

        //concatenation
        String firstName="anshu";
        String lastName="kumari";
        String fullName= firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }        
}
