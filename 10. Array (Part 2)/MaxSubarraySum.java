public class MaxSubarraySum{

        static void printSubarrays(int num[]){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < num.length ; i++){
                int start = i;
                for(int j = i ; j < num.length ; j++){
                int end = j;
                currentSum = 0;
                 for(int k = start ; k <= end ; k++){ //print
                    //SubArray Sum
                    currentSum+= num[k];
                 }
                 System.out.println(currentSum);
                 if(maxSum < currentSum){
                    maxSum = currentSum;
                 }
                }
                System.out.println();
            }
            System.out.println("The maxSum is : "+maxSum);
        }
        public static void main(String[] args) {
            int num[] = {1,-2,6,-1,3};
            printSubarrays(num);
        }
    
    
}