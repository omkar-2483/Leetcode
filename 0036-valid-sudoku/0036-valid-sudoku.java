class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i< 9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){ 
                    continue;
                }
                else{
                    if(! isSafe(board, i, j, board[i][j])) return false;
                }
            }
        }

        return true;
    }

    public boolean isSafe(char[][] sudoku, int row, int col, char digit){
        //column check
        for(int i=0; i<9; i++){
            if(i!=row && sudoku[i][col]==digit) return false;
        }

        //row check
        for(int j=0; j<9; j++){
            if(j!=col && sudoku[row][j]==digit) return false;
        }

        //subgrid check
        int sr= (row/3)*3;
        int sc= (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(i!=row && j!=col && sudoku[i][j]==digit) return false;
            }
        }

        //finally
        return true;
    }
}