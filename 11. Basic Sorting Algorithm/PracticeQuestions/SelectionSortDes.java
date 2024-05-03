public class SelectionSortDes {

        public static void selectionSort(int nums[]){
        
          
          for(int i = 0 ; i <= nums.length - 1 ; i++){
            int minPosition = i;
            for(int j = i+1 ; j <= nums.length-1  ; j++){
            if(nums[minPosition] < nums[j]){
                minPosition = j;
            }
          }
          // swap 
          int temp = nums[minPosition];
          nums[minPosition] = nums[i];
          nums[i] = temp;
        }
    }
          public static void printArr(int nums[]){
            for(int i = 0 ; i <= nums.length-1 ; i++){
                System.out.print(nums[i] + " ");
            }
          }
    
        public static void main(String[] args) {
            int nums[] = {3,6,2,1,8,7,4,5,3,1};
            selectionSort(nums);
            printArr(nums);
    
        }
    }
     

