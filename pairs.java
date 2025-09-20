public class pairs {
    public static void printpairs(int number[]){
        int total=0;
        for(int i=0;i<number.length;i++){
            int current=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+ current +"," +number[j] +")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs= "+total);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printpairs(number);
    }
}
