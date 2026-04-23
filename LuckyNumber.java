import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> race =  new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m ; i++) {
            int min = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < n; j++) {
              if(matrix[i][j] < min){
                  min = matrix[i][j];
                  colIndex = j;

              }
            } boolean isLucky = true;
            for (int[] ints : matrix) {
                if (ints[colIndex] > min) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) race.add(min);
        }
        return race;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }
}
