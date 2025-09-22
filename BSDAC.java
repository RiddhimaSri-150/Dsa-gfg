public class BSDAC{
    public static void main(Strings[] args){
         int[] arr = {1, 4, 6, 8, 90, 110, 340, 500};
        int target = 90;
        System.out.println(search(arr, target, 0 ,arr.length - 1));
    }
     static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s+ (e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if(target < arr[m]) {
           return search(arr,  target, s, m - 1);
        }
        return search(arr, target, m + 1 , e);
    }
}