public class Homework {
        static void maxSubarraysSumKadane(int num[]){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int maxSum1 = Integer.MIN_VALUE;

            int i =0;

            while(i<num.length){
                if(num[i]>maxSum && num[i] < 0){
                      maxSum = num[i];
               }
             i++;
          }
                for(i = 0 ; i < num.length ; i++){
                if(num[i] > 0){
                currentSum += num[i];
                }
                if(currentSum < 0){
                    currentSum = 0;
                }
                maxSum1 = Math.max(currentSum , maxSum1);
            }
                // if(currentSum > maxSum){
                //     maxSum = currentSum;
                // }
                System.out.println("The maximum sum of Subarrays : "+maxSum);

                System.out.println("The maximum sum of subarrays : " +maxSum1);
        
        }
        
        public static void main(String[] args) {
            int  num[] = {-2,-3,4,-1,-2,1,5,-3};
            maxSubarraysSumKadane(num);
        }
    }
    

