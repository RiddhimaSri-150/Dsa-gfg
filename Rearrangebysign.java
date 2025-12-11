import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rearrangebysign {
    public static void main(String[] args) {

    }
    static List SamenoSign(int[] arr){
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < n/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i +1] = neg.get(i);
        }
        return Collections.singletonList(arr);
    }
    static List OptimalSol(int[] arr){
        int n = arr.length;
        ArrayList<Integer> s = new ArrayList<>();
        int posIdx = 0;
        int negIdx = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i]< 0){
                negIdx = arr[i];
                negIdx += 2;
            }
            else{
                posIdx =arr[i];
                posIdx += 2;
            }
        }
        return s;
    }
}
