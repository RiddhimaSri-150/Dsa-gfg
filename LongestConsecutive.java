import java.util.Arrays;

import static java.lang.Math.max;

public class LongestConsecutive {
    static int Longccccons(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int longest = 1;
        int cnt = 0;
        int last_smaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == last_smaller) {
                cnt = cnt + 1;
                last_smaller = arr[i];
            } else if (arr[i] != last_smaller) {
                cnt = 1;
                last_smaller = arr[i];
            }
            longest = max(longest,cnt);
        }
        return longest;
    }
}
