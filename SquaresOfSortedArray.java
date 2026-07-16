import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
       int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i]* nums[i];
        }
        Arrays.sort(nums);
        return arr;
    }
}
