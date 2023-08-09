package DSA.Lecture_4Recursion;

public class SudokuSolver {
    public static void main(String... args){

    }
    /**
     * [["5","3",".",".","7",".",".",".","."],
     * ["6",".",".","1","9","5",".",".","."],
     * [".","9","8",".",".",".",".","6","."],
     * ["8",".",".",".","6",".",".",".","3"],
     * ["4",".",".","8",".","3",".",".","1"],
     * ["7",".",".",".","2",".",".",".","6"],
     * [".","6",".",".",".",".","2","8","."],
     * [".",".",".","4","1","9",".",".","5"],
     * @param board
     */
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){

                if(board[i][j] == '.'){
                    for(char k='1'; k<='9'; k++){
                        if(possible(board, i, j, k)){
                            board[i][j] = k;

                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean possible(char[][] board, int row, int col, char res){
        for(int i=0; i<board.length; i++){
            if(board[row][i]==res){
                return false;
            }

            if(board[i][col]==res){
                return false;
            }

            if(board[3 * (row/3) + i/3][3* (col/3)+i%3]==res)
                return false;
        }
        return true;
    }
}
