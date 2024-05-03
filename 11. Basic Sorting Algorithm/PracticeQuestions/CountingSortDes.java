public class CountingSortDes {

        public static void counting_Sort(int arr[]){
         int largest = Integer.MIN_VALUE;
         for(int i = 0; i<arr.length ; i++){
            largest = Math.max(largest , arr[i]);
         }
    
         int count[] = new int[largest+1];
         for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
         }
    
         //sorting
         int j = 0;
         for(int i = count.length-1 ; i >= 0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]-- ;
            }
         }
        }
         public static void printArr(int nums[]){
            for(int i = 0 ; i < nums.length ; i++){
                System.out.print(nums[i]+ " ");
            }
         }
    
        public static void main(String[] args) {
            int nums[] = {3,6,2,1,8,7,4,5,3,1};
            counting_Sort(nums);
            printArr(nums);
        }
    }
    
