package ArrayList;
import java.util.ArrayList;
public class classroom {
    public static void main(String[] args) {

        // java collection frame work
        //className objectName =new className();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();

        //Add opertion
        list.add(1);//o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

      //  System.out.println(list.size());  5
    //   for(int i=0;i<list.size();i++){
    //     System.out.println(list.get(i)+" ");
    //   }

        list.add(1,9);//O(n)
        System.out.println(list);

        //get opertion-O(1)
        int element=list.get(2);
        System.out.println(element);

        //delete
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(2,10);
        System.out.println(list);

        //contain element 
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
