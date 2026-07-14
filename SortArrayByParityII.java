import java.util.Arrays;

public class SortArrayByParityII {
    public static int[] sortArrayByParity(int[] nums){
        int n = nums.length;
        int even = 0, odd = 1;
        while (even < n && odd < n) {
            while (even < n && nums[even] % 2 == 0) even += 2;
            while (odd < n && nums[odd] % 2 == 1) odd += 2;
            if (even < n && odd < n) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr ={4,1,2,1};
        int[] res = sortArrayByParity(arr);
        System.out.println(Arrays.toString(res));
    }
}
