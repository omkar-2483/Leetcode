class Solution {
    public void rotate(int[][] matrix) {
        //take transpose
        transpose(matrix);
        //reverse columns
        for(int[] i : matrix){
            reverse(i);
        }
    }

    private void transpose(int[][] matrix){
        for(int i=0; i< matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    private void reverse(int[] arr){
        int n=arr.length;
        for(int i=0; i< n/2; i++){
            int temp=arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
}