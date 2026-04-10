import java.util.Arrays;

public class TransposeOfMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                    ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] result = transpose(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j] + " ");
            }
        }
    }
}
