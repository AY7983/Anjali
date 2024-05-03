public class MaxSubarraySum2 {

        static void printSubarrayPrefix(int num[]){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int prefixSum[] = new int[num.length];

            prefixSum[0] = num[0];
            //Calculate prefix Array
            for(int i = 1; i < num.length ; i++){
                prefixSum[i] = prefixSum[i-1]+num[i];
            }
    
            for(int i = 0; i < num.length ; i++){
                int start = i;
                for(int j = i ; j < num.length ; j++){
                int end = j;
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end]-prefixSum[start-1];
                 if(maxSum < currentSum){
                     maxSum = currentSum;
                 }
                }
            } 
            System.out.println("The maxSum is : "+maxSum);
        }
        public static void main(String[] args) {
            int num[] = {1,-2,6,-1,3};
            printSubarrayPrefix(num);
        }
}

