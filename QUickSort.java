public class QuickSort {
    public static void main(String[] args) {
        int[] arr= { 4, 1, 3, 9, 7};
        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void Quick(int[] arr, int low, int high){

           if (low < high) {
               int p = partition(arr, low, high);

               Quick(arr, low, p - 1);
               Quick(arr, p + 1, high);

       }

    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr,i +1,high);
         return i+1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}