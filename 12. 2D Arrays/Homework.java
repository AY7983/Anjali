import java.util.*;
public class Homework {

    public static boolean smallestSearch(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; i < matrix[0].length ; j++){
                if(smallest > matrix[i][j]){
                   smallest = Math.min(matrix[i][j] , smallest);
                   System.out.println("Smallest Key Found at cell :  ("+ i+ " ,"+j+"  )");
                   return true;
            }
         }
    }
    return false;
}
public static boolean largestSearch(int matrix[][] ){
    int largest = Integer.MIN_VALUE;
    for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; i < matrix[0].length ; j++){
            if(largest < matrix[i][j]){
               largest = Math.max(matrix[i][j] , largest);
               System.out.println("largest Key Found at cell :  ("+ i+ " ,"+j+"  )");
               return true;
        }
     }
}
return false;
}
    public static void main(String[] args) {
     int matrix[][] = new int[3][3];
     int n = matrix.length; int m = matrix[0].length;

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your elements of array : ");
     for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; i < m ; j++){
            matrix[i][j] = sc.nextInt();
        }
     }
     for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; i < m ; j++){
            System.out.print(matrix[i][j]+" ");
        }
     }
     smallestSearch(matrix);
     largestSearch(matrix);
    }
}
