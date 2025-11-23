public class MissingNumber {
    public static void main(String[] args) {
       int[] arr = {1,2,4,5};
        System.out.println(missingNo(arr));
    }
    static int missingNo(int[] arr){
        int j = 1;
        for ( int i = 0; i < arr.length; i++) {
            if(j == arr[i]){
                j ++;
            }
            else{
                break;
            }
        }
        return j;
    }
}
