import java.util.*;
public class Creation{
    
    // for search the element after making the 2D Arrays
    public static boolean search(int matrix[][],int key){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" +i+" , "+j+" )");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int  matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        //for input the elements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your elements : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //for output the elements
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //Call the search function to find the key element
        search(matrix ,  5);
    }
}