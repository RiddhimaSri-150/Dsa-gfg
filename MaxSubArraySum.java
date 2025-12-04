public class MaxSubArraySum{
    public static void main(String[] args){

    }
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
  
        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
      
            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
              
                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
    // using Kadane's algorithm
    static int maxSubarraySum1(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int Start = 0;
        for (int i = 0; i < n ; i++) {
            if(sum == 0) Start = i;

            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
                ansStart = Start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}