public class MajorityElement{
     static int majorityElement(int[] arr) {
        int n = arr.length; 

        // Loop to consider each element as 
        // a candidate for majority
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Inner loop to count the frequency of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if count of arr[i] is more
            // than half the size of the array
            if (count > n / 2) {
                return arr[i];
            }
        }
}