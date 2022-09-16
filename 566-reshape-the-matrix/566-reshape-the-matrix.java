class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] matrix = new int[r][c];
        
        if(r * c == mat.length * mat[0].length) {
            int row = 0;
            int col = 0;
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[0].length; j++) {
                    if(col == c) {
                        row++;
                        col = 0;
                    }
                    matrix[row][col] = mat[i][j];
                    col++;
                }
            }
            return matrix;
        } else {
            return mat;
        }
    }
}