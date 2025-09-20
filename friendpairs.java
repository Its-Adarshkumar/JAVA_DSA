public class friendpairs {
    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int fnm1=friendPairing(n-1);

        //pair
        int fnm2=friendPairing(n-2);
        int pairchoice=(n-1)*fnm2;

        //totalways
        int totWays=fnm1+pairchoice;
        return totWays;
    }
    public static void main(String[] args) {
        
        System.out.println(friendPairing(3));
    }
}
