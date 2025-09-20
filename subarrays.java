public class subarrays {
    public static void printsubarray(int number[]){
        int ts =0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){// print 
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are " +ts);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarray(number);
    }
}
