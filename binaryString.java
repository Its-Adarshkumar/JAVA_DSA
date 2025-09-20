public class binaryString {
    public static void printBinaryString(int n,int lastplace,String str){
       //base
       if(n==0){
        System.out.println(str);//empty string
        return;
       }
       
        //kaam
        // if(lastplace==0){
        //    //sit 0 on chair n
        //    printBinaryString(n-1, 0, str.append("0"));
        //    printBinaryString(n-1, 1, str.append("1"));
        // }
        // else{//lastplace 1
        //     printBinaryString(n-1, 0, str.append("0"));
        // }
        
        //kaam
        printBinaryString(n-1, 0, str+"0");
        if(lastplace==0){
            printBinaryString(n-1, 1, str+("1"));
        }
    } 
    public static void main(String[] args) {
        printBinaryString(3, 0,"");
    }
}
