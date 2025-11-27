

public class SortArray {
    static void Sort0s1s2s(int[] a){
        int n = a.length;
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int j : a) {
            if (j == 0)
                cnt0++;
            else if (j == 1) {
                cnt1++;
            } else
                cnt2++;
        }
        for (int i = 0; i < cnt0; i++) {
            a[i] = 0;
        }
        for (int i = cnt0; i < cnt0+cnt1; i++) {
            a[i] = 1;
        }
        for (int i = cnt0+ cnt1; i < n; i++) {
            a[i] = 2;

        }
    }
    static void Sort10s1s2s(int[] a){
        int n = a.length;
       int low = a[0];
       int mid = a[0];
        int high = n;
        while(mid<= high){
            if(a[mid] == 0){
                swap(a,a[low],a[mid]);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            }
            else {
                swap(a, a[mid], a[high]);
                high--;
            }
        }
    }
    static void swap(int[] luv, int index1, int index2) {
        int temp = luv[index1];
        luv[index1] = luv[index2];
        luv[index2] = temp;
    }
}
