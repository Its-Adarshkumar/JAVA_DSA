public class methodover {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        System.out.println(calc.Sum(1, 2));
        System.out.println(calc.Sum(1, 2, 3));
        System.out.println(calc.Sum((float)1.5, (float)2.5));
    }
}

class Calculator{
    int Sum(int a ,int b){
        return a+b;
    }

    int Sum(int a, int b, int c){
        return a+b+c;
    }

    float Sum(float a ,float b){
        return a+b;
    }
}