/**
 * prog02_w1
 */
public class prog02_w1 {
    public static void main(String[] args) {
                
        for(int star=1; star<=5;star++){
            char ch='A';
            for(int line =1;line<=5;line++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    
}