// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int[] zeroRows=new int[matrix.length];
//         int[] zeroColumn = new int[matrix[0].length];

//         int n=matrix.length;
//         int m=matrix[0].length;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix[i][j]==0){
//                     zeroRows[i]=1;
//                     zeroColumn[j]=1;
//                 }
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(zeroRows[i]==1 || zeroColumn[j]==1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }
// }

//best solution, reduce space complexity, don't use extra arrays to store zero rows and columns
class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int col0=1; // zero columns stored in col0 and matrix[0][1 t0 m-1]
                    // zero rows stored in matrix[0 to n-1][0]

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j==0) col0=0; 
                    else matrix[0][j]=0;   
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0) matrix[i][j]=0;
            }
        }
        if(matrix[0][0]==0){
            for(int j=0; j<m; j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0; i<n; i++){
                matrix[i][0]=0;
            }
        }
    }
}