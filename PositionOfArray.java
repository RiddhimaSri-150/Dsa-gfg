import java.lang.reflect.Array;
import java.util.Arrays;

public class PositionOfArray {
    public  int[] searchRange(int[] nums, int target) {
       int[] arr = {-1,-1};
       arr[0] = first(nums,target);
       arr[1] = last(nums,target);

        return arr;
    }

    private  int last(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int last = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid +1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    private  int first(int[] nums, int target) {


        int start = 0;
        int end = nums.length-1;
        int first = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
            return first;
    }

//    public static void main(String[] args) {
//        int[] a = {5,7,7,8,8,10};
//        int tar = 8;
//        int[] res = searchRange(a, tar);
//        System.out.println(Arrays.toString(res));
//    }
}
