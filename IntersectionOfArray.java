import java.util.HashSet;

public class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();
        for (int j : nums1) {
            hs.add(j);
        }
        for (int num : nums2) {
            if (hs.contains(num)) {
                inter.add(num);
            }
        }
        int[] result = new int[inter.size()];
        int i = 0;
        for (int num : inter) {
            result[i++] = num;
        }

        return result;
    }
}
