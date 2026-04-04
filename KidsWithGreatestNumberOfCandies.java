import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.max;

public class KidsWithGreatestNumberOfCandies {
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        int greatest = max(candies);
        for (int candy : candies) {
            if (candy + extraCandies > greatest) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    private  int max(int[] arr) {
        int maximim = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (maximim < arr[i + 1]) {
                maximim = arr[i + 1];
            }
        return maximim;
    }
}
