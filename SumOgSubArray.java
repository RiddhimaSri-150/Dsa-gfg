public class SumOgSubArray {
    static int subarrays(int[] arr){
        int n = arr.length;
        int result= 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp+= arr[j];
                result += temp;
            }
        }
        return result;
    }
}
