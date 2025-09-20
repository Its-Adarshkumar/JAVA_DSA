import java.util.*;
public class Matrix {
    public static boolean search(int matrixs[][], int key){
        for(int i=0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[0].length;j++){
            if(matrixs[i][j]== key){
                System.out.println("found at the index = ("+i +"," +j+")");
                return true;
            }
            }
        }
        System.out.println("key is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrixs[][]=new int [3][3];
        int n=matrixs.length, m =matrixs[0].length;

        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixs[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print(matrixs[i][j] + " ");
            }
            System.out.println();
        }
        search(matrixs, 5);
    }
}
