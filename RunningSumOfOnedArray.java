import java.util.Arrays;

public class RunningSumOfOnedArray {
    public static int[] runningSum(int[] nums) {
       int[] ans = new int[nums.length];
       int sum = 0;
        for (int i = 0; i < nums.length ; i++) {

            ans[i] = nums[i] + sum;
            sum = sum + nums[i];

        }
        return ans;
    }

    public static void main(String[] args) {
      int[] arr = {1, 2, 3,4};
      int[] result = runningSum(arr);
        System.out.println(Arrays.toString(result));
    }
}
