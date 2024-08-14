class Solution {
    static int count;
    Solution(){
        count=0;
    }
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        helper(board,0);
        return count;
    }

    private void helper(char[][] board,int col){
        if(col==board.length){
            count++;
            return;
        }
        
        for(int i=0; i<board.length;i++){
            if(isSafe(board,col,i)){
                board[i][col]='Q';
                helper(board,col+1);
                board[i][col]='.';
                
            }
        }
    }
    
    
    private boolean isSafe(char[][] board,int col,int row){
        //check column
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q')
                return false;
        }
        //check row
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q')
                return false;
        }
        //check upper left
        int c=col;
        for(int r=row;r>=0 && c>=0;r--,c--){
            if(board[r][c]=='Q')
                return false;
        }
        //check upper right
        c=col;
        for(int r=row;r>=0 && c<board.length;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //check lower left
        c=col;
        for(int r=row;r<board.length && c>=0;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //check lower right
        c=col;
        for(int r=row;r<board.length && c<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
}