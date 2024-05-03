public class TransposeMatrix {

    public static void transposeOfMatrix(int matrix[][]){
        int [][]transpose = new int [matrix[0].length][matrix.length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ;j < matrix[0].length ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printTranposeMatrix(transpose);
    }
    public static void printTranposeMatrix(int matrix[][]){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ;j < matrix[0].length ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{2,3,4},{4,5,6}};
        printTranposeMatrix(arr);
        transposeOfMatrix(arr);
    }
}
