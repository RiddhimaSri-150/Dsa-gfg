public class SingleElementInArray {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make sure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Single element is on the right side
                left = mid + 2;
            } else {
                // Single element is on the left side (including mid)
                right = mid;
            }
        }

        return nums[left];
    }
}
