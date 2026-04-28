public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int[n][n];
        int colBegin = 0, colEnd = n-1;
        int rowBegin = 0, rowEnd = n-1;
        int val = 1;
        while(rowBegin <= rowEnd && colBegin<= colEnd){
            for (int i = colBegin; i <= colEnd; i++) {
                arr[rowBegin][i] = val++;
            }
            for (int i = rowBegin + 1; i <= rowEnd; i++) {
                arr[i][colEnd] = val++;
            }
            if (rowBegin < rowEnd) {
                for (int i = colEnd - 1; i >= colBegin; i--) {
                    arr[rowEnd][i] = val++;
                }
            }

            // Bottom to top
            if (colBegin < colEnd) {
                for (int i = rowEnd - 1; i > rowBegin; i--) {
                    arr[i][colBegin] = val++;
                }
            }
          colBegin++; colEnd--;
            rowBegin++; rowEnd--;
        }
        return arr;
    }
}
