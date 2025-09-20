package Stack;
import java.util.*;

public class maxHisto {

    public static void maxArea(int arr[]){ //O(n)
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];


        //Next smaller Right
        Stack<Integer> s=new Stack<>();

        for (int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //Next smaller Left
        s=new Stack<>();

        for (int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=arr.length;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }


        //current Area:width =j-i-1 =nsr[j] -nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i] -nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Maximum area of Histogram is: "+maxArea);

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};  //heights in histogram
        maxArea(arr);
    }
}
