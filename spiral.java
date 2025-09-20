public class spiral {
    public static void printspiral(int matrix[][]){
        int startRow=0;
        int startColm=0;
        int endRow=matrix.length-1;
        int endColm=matrix[0].length-1;

        while(startRow<=endRow && startColm<=endColm){
            //top
            for(int j=startColm;j<=endColm;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColm]);
            }

            //bottom
            for(int j=endColm-1;j>=startColm;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColm==endColm){
                    break;
                }
                System.out.print(matrix[i][startColm]);
            }
            startRow++;
            startColm++;
            endRow--;
            endColm--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                         {5, 6, 7, 8},                 
                         {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        printspiral(matrix);
    }
    
}
