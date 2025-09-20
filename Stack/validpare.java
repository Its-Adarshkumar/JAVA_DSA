package Stack;
import java.util.*;
public class validpare {

    public static boolean isValid(String str){  //O(n)
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //opening brackets
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                //closing brackets
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')' ) 
                || (s.peek()=='{' &&ch=='}')
                ||(s.peek()=='[' && ch ==']') ){
                s.pop();
                }else{
                    return false;
                }
            }
        }

        //checking stack is empty or not
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({})[]"; //true
        System.out.println(isValid(str));
    }
}
