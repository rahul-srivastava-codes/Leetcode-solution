class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j = 0; j<col; j++){                                    
                res[j][i] = matrix[i][j];
            }
        }
        System.gc();
        return res;
    }
}

// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
