class Solution {
    public void setZeroes(int[][] matrix) {
         // Get number of rows
        int m = matrix.length;
        // Get number of columns
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        // Create column marker array
        boolean[] col = new boolean[n];
        for(int i =0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i =0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(row[i]==true || col[j]==true){
                    matrix[i][j]=0;
                }
            }
        }
    }
}