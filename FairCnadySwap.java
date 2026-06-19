import java.util.HashSet;
import java.util.Set;

public class FairCnadySwap {
    public int[] fairCandySwap(int[] a, int[] b) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet();
        int sumA = 0 , sumB = 0;
        for(int i =0; i<a.length; i++)
            sumA = sumA +a[i];
        for (int i = 0; i < b.length; i++) {
            sumB = sumB + b[i];
            set.add(b[i]);
        }
        int finalSum = (sumA + sumB)/2;
        for (int i = 0; i < a.length; i++) {
            int val = finalSum + sumA - a[i];
            if(set.contains(val)){
                res[0] = a[i];
                res[1]= val;
                return res;
            }
        }
        return res;
    }
}
