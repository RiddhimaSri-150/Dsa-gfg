import java.util.ArrayList;
import java.util.Collections;

public class Arrays_Leaders {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> leader(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j;
            for ( j = i + 1; j < n ; j++) {
                if(arr[i]< arr[j]){
                    break;
                }
            }
          if(j == n){
              res.add(arr[i]);
          }
        }
        return res;
    }
    static ArrayList<Integer> leader2(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int maxRight = arr[n-1];
        res.add(maxRight);
        for (int i = n-2; i >= 0 ; i++) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];

                res.add(maxRight);
            }

        }
        Collections.reverse(res);
        return  res;
    }
 }
