import java.util.Arrays;
import java.util.Collections;
public class BubbleSortDescending{

    public static void printArr(Integer nums[]){
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
      Integer nums[] = {3,6,2,1,8,7,4,5,3,1};
      Arrays.sort(nums,Collections.reverseOrder());
      printArr(nums);

    }
}