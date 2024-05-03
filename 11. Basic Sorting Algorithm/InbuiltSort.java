import java.util.Arrays; //Package for sort the array in ascending order only
import java.util.Collections; //Package for sort the array in reverse order(desscending order)
public class InbuiltSort {

       
        public static void printArr(Integer arr[]){
            for(int i = 0; i < arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static int compare(int a,int b){ // logic of reverse order (using comparator in reverse order)
          //a < b -ve
          //a == b 0
          //a > b +ve
          return b-a;

        }
       public static void main(String[] args) {
        Integer arr[] = { 5, 4, 3, 1 , 4 , 2};
        // Arrays.sort(arr);
        // Arrays.sort(arr,1,4);
        Arrays.sort(arr,1,5,Collections.reverseOrder());
        printArr(arr);
        
       }
    
}
