 public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for(int i = 0; i<n/2; i++){
            int t = arr[i];
            arr[i] = arr[ n - i - 1];
            arr[n - i -1] = t;
        }
    }