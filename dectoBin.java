public class dectoBin {
    public static void decimaltobin(int n){
        int myNum=n;
        int pow=0;
        int binnum=0;
        while(n>0){
            int rem=n%2;
            binnum=binnum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+ myNum +" ="+binnum);
    }
    public static void main(String[] args) {
        decimaltobin(7);
    }
}
