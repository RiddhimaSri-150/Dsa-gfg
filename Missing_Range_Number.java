import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Missing_Range_Number {
    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingno(arr, lower, upper);
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }
    }
    static List<List<Integer>> missingno(int[] arr, int lower, int upper){
        List<List<Integer>> res = new ArrayList<>();
                if(lower < arr[0]){
                    res.add(Arrays.asList(lower, arr[0] - 1));
                }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1] - arr[i] > 1){
                res.add(Arrays.asList(arr[i]  + 1, arr[i + 1] - 1));
            }
        }
        if(upper> arr[arr.length-1]){
            res.add(Arrays.asList(arr[arr.length-1], upper));
        }
        return res;
    }
}
