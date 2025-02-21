class Solution {
    public void setZeroes(int[][] matrix) {
        int[] zeroRows=new int[matrix.length];
        int[] zeroColumn = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    zeroRows[i]=1;
                    zeroColumn[j]=1;
                }
            }
        }
        for(int i=0; i<zeroRows.length; i++){
            if(zeroRows[i]==1) matrix[i] = new int[matrix[i].length];
        }
        for(int j=0; j<zeroColumn.length; j++){
            if(zeroColumn[j]==1) {
                for(int i=0; i<matrix.length; i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}