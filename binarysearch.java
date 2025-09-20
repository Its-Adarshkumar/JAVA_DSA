public class binarysearch {

    public static int update(int numbers[],int key){
        int start=0 , end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //compare
            if(numbers[mid]==key){
               return mid; 
            }
            if(numbers[mid]<key){
                start=mid+1;  //2nd half
            }
            else{
                end=mid-1; //1st half
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Index for key = "+ update(numbers,key));
    }
}
