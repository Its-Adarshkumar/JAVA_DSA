public class reverseofthegiven {
    public static void main(String[] args) {
        int rev=0;
        int n=10899;
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
    }
}
