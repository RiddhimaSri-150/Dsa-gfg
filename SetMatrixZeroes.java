import java.util.Arrays;

public class SetMatrixZeroes {
    static int[][] Zero_Matrix(int[][] matrix, int n, int m){
        int[] col = new int[n];
        int[] row = new int[m];

        Arrays.fill(col, 0);
        Arrays.fill(row, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] ==0){
                    row[i] = 1;
                    col[j] = 1;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[i] ==1 || col[j]==1)
                    matrix[i][j] = 0;

            }
        }
        return matrix;
    }
}
