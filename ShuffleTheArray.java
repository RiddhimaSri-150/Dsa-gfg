import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] result = shuffle(arr, 3);
        System.out.println(Arrays.toString(result));
    }
}
