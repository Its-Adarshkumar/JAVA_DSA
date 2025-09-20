public class tiling {
    public static int tailingproblem(int n){//2 *n(floor size)


        //base case
        if(n==0 ||n==1){
            return 1;
        }

        //choice 

        //vertical choice
        int fnm1=tailingproblem(n-1);

        //horizontal choice
        int fnm2=tailingproblem(n-2);

        int totalWays=fnm1+fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tailingproblem(4));
    }
}
