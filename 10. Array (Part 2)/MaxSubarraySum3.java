public class MaxSubarraySum3 {
    static void maxSubarraysSumKadane(int num[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < num.length ; i++){
            currentSum += num[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            
            // if(currentSum > maxSum){
            //     maxSum = currentSum;
            // }
            maxSum = Math.max(currentSum , maxSum);
        }
        System.out.println("The maximum sum of Subarrays : "+maxSum);
    }
    public static void main(String[] args) {
        int  num[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraysSumKadane(num);
    }
}
