import java.util.*;
public class BubbleSort{

    public static void bubbleSort(int nums[]){
        for(int turn = 0 ; turn <= nums.length - 2; turn++ ){
            int swap = 0 ;
            for(int j = 0 ; j <= (nums.length - 2 - turn); j++){
                if(nums[j] > nums[j+1]){
                     // swap
                    int temp = 0;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap > 0){
                break;
            }
            
    }
    System.out.print("Array is already Sorted : ");
    }
    public static void printArr ( int nums[]){
        for(int i = 0 ; i < nums.length ; i ++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     int nums[] = {1,2,3,4,5};
     bubbleSort(nums);
     printArr(nums);
    }
}