public class DiagonalSum2 {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        for(int i = 0; i<matrix.length;i++){
            //for primary diagonal
            sum+=matrix[i][i];

            //for secondary diagonal sum
            if(i != matrix.length - i - 1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
      }
      public static void main(String[] args) {
          int arr[][] = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
          System.out.println("The sum of diagonal is : "+diagonalSum(arr));
      }
  }
  

