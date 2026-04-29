import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] ans = new int[n];

        ans[0] = 1;

        // prefix product
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        // multiply suffix product
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }
}
