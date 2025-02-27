class Solution {
    public int uniquePaths2(int m, int n) {
        //paths(i,j) = paths(i+1, j) + paths(i, j+1);

        int[][] paths = new int[m][n];
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1 && j==n-1){
                    paths[i][j]=1;
                }else if(i==m-1){
                    paths[i][j]=paths[i][j+1];
                }else if(j==n-1){
                    paths[i][j]=paths[i+1][j];
                }else{
                    paths[i][j]= paths[i+1][j]+paths[i][j+1];
                }
            }
        }

        return paths[0][0];
    }

//space optimization- As we can see to calculate paths[i][j] we need only row i and i+1 i.e. curr and prev row
    public int uniquePaths(int m, int n) {
        //paths(i,j) = paths(i+1, j) + paths(i, j+1);

        int[] prev=new int[n];

        for(int i=m-1; i>=0; i--){
            int[] curr = new int[n];
            curr[n-1]=1;
            for(int j=n-2; j>=0; j--){
                if(i==m-1){ //last row
                    curr[j]=1;
                }else{
                    curr[j]= prev[j]+curr[j+1];
                }
            }
            prev=curr;
        }

        return prev[0];
    }

}