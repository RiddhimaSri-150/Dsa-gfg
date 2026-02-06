public class Subarraysumk {
    public static int cntSubarrays(int[] arr, int k) {

        // for maintaining the count of
        // subarrays whose sum equal to k
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currSum = 0;

            // subarray from i to each j -> arr[i....j]
            for (int j = i; j < n; j++) {
                currSum += arr[j];

                // increment count if the currSum equals k
                if (currSum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
