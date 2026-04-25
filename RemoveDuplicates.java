import java.util.HashSet;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
