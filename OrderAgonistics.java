public class OrderAgonistics{
    public static void main(String[] args){
        int[] arr ={-5,-2,-1, 0, 5, 8 ,98, 102, 203, 678}
        int target = 98;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr,int target){
       int start = 0;
       int end = arr.length-1;
       //find whether the array is sorted or notin ascending or descending
       boolean isAsc = arr[start]< arr[end];


       while(start <= end){
           //find the middle element
//            int mid = (start + end)/2;//this may exceeds might (start+end)/2 int range
           int mid = start + (end - start) / 2;
           if(arr[mid] == target){
               return mid;
           }
           if (isAsc){
               if (target < arr[mid]){
                   end = mid -1;
               }else {
                   start = mid + 1;
               }
           }

           else {
               if (target > arr[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           }
       }
       return -1;

   }
}