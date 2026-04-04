import java.util.Arrays;

public class NumberSmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
          int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int c= 0;
            for (int num : nums) {

                if (num < nums[i])
                    c++;
            }
            ans[i] = c;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(result));
    }
}
