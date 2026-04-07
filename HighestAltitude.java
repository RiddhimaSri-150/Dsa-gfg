public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
     int n = gain.length;
     int sum = 0;
     int[] a = new int[n+1];
     a[0] = 0;
     for(int i = 0; i<n ;i++){
         a[i+1] = gain[i] + sum;
         sum += gain[i];

     }
     int res = 0;
        for (int i = 0; i < n +1; i++) {
            if(res < a[i]){
                res = a[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 1,5,0,-7};
        int ans = largestAltitude(arr);
        System.out.println(ans);
    }
}
