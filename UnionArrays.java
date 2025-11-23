import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class UnionArrays {

    static ArrayList<Integer> Union(int[] a, int[] b){
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int j : a) {
            if (!res.contains(j)) {
                res.add(j);
            }
        }
        for (int j : b) {
            if (!res.contains(j)) {
                res.add(j);
            }
        }
        Collections.sort(res);
        return res;
    }
    // Using Set
    static ArrayList<Integer> UnionSet(int[] a, int[] b){
        Set<Integer> st = new TreeSet<>();
        for (int j : a) {
            st.add(j);
        }
        for (int j : b) {
            st.add(j);
        }
        return new ArrayList<>(st);
    }
}
