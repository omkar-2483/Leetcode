class Solution {
    public void setZeroes(int[][] matrix) {
        int[] zeroRows=new int[matrix.length];
        int[] zeroColumn = new int[matrix[0].length];

        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    zeroRows[i]=1;
                    zeroColumn[j]=1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(zeroRows[i]==1 || zeroColumn[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}