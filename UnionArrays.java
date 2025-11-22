import java.util.ArrayList;
import java.util.Collections;

public class UnionArrays {

    static ArrayList<Integer> Union(int[] a, int[] b){
        ArrayList< Integer> res = new ArrayList<Integer>();
        int n1 = a.length;
        int n2 = b.length;
        for (int i = 0; i < n1; i++) {
            if(!res.contains(a[i])){
                res.add(a[i]);
            }
        }
        for (int i = 0; i < n2 ; i++) {
            if(!res.contains(b[i])){
                res.add(b[i]);
            }
        }
        Collections.sort(res);
        return res;
    }
}
