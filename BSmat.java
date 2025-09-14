public class BSmat{
    public static void main(Strings[] args){
     int[][]  arr = {
                {2, 3, 5, 6},
                {7, 8, 9, 10},
                {11, 12, 13, 19},
                {20, 21, 22, 23}
        };
        System.out.println(Arrays.toString(search(arr, 13 )));
    }
    static int[] search(int[][] matrix, int target){
       int r = 0;
       int c = matrix.length - 1;

       while (r < matrix.length && c>= 0){
           if(matrix[r][c] == target) {
               return new int[] {r, c};
           }
           if (matrix[r][c] < target){
               r++;
           }else{
               c--;
           }
       }
       return new int[]{-1, -1};
   }
}