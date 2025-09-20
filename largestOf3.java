public class largestOf3 {
    public static void main(String[] args) {
        int A=1;
        int B=3;
        int c=6;
        if((A>B) && (A>c)){
            System.out.println("A is the largest");
        }
        else if(B>c){
            System.out.println("B is the largest");
        }
        else{
            System.out.println("C is the largest");
        }
    }
}
