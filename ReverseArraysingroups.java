public class ReverseArraysingroups {
    public void reverseInGroups(int[] arr, int k){
        int n = arr.length;
        for (int i = 0; i < n ; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            int temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    }
    
}
