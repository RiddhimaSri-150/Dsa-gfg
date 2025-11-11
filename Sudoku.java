public class Sudoku{
    static  boolean Sudoku(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if(emptyLeft == false){
                break;
            }
        }
        if(emptyLeft == true){
            return true;
            // sudoko is solve
        }
        // backtrack
        for (int number = 1; number <= 9 ; number++) {
            if(isSafeS(board, row, col, number)){
                board[row][col] =  number;
                if(Sudoku(board)){
                    //found the answer
                    displayS(board);
                    return true;
                }else{
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    private static void displayS(int[][] board){
        for(int[] row: board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafeS(int[][] board, int row, int col, int num){
        //check the row
        for (int i = 0; i < board.length; i++) {
            //check if the number is in the row
            if (board[row][i] == num){
                    return true;
            }
        }
        // check for column
        for (int[] nums : board ) {
            //check if the number is in the row
            if ( nums[col] == num){
                return false;
            }
        }
        int sqrt =(int)(Math.sqrt(board.length));
        int rowStart = row - row% sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt ; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return  true;
    }
}