
public class bitOddEven {
    public static void bitManipulation(int n){
        int bitmask=1;
        if( (n & bitmask )==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static int getithBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else {
            return 1;
        }
}
public static int setIthbit(int n, int i){
    int bitmask=1<<i;
    return n | bitmask;
}

public static int clearIthBit(int n, int i){
    int bitmask=~(1<<i);
    return n & bitmask;
}

public static int updateIthBit(int n, int i, int newBit){
    // if(newBit==0){
    //     return clearIthBit(n, i);
    // }else{
    //     return setIthbit(n, i);
    // }

    n=clearIthBit(n, i);
    int bitmask=newBit<<i;
    return n | bitmask;
}

public static boolean isPowerofTwo(int n){
    return (n&(n-1))==0;
}

public static int countsetBits(int n){
    int count =0;
    while(n>0){
        if((n & 1)!=0){ //check our LSB
            count++;
        }
       n= n>>1;
    }
    return count;
}

public static int fastExpo(int a , int n){
    int ans=1;
    while(n>0){
        if((n &1)!=0){
        ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}
    public static void main(String[] args) {
       // bitManipulation(3);
        //bitManipulation(11);
        //bitManipulation(14);
       // System.out.println(getithBit(10, 2));
       // System.out.println(setIthbit(10, 2));
      // System.out.println(clearIthBit(10, 1));
      // System.out.println(updateIthBit(10, 2, 1));
       //System.out.println(isPowerofTwo(16));
      // System.out.println(countsetBits(15));
      System.out.println(fastExpo(5, 3));
    }
}
