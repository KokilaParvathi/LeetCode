class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows]; 

        for (int i = 0; i < rows * cols; i++) {
            int row = i / cols, col = i % cols;
            transposed[col][row] = matrix[row][col];
        }

        return transposed;
    }
}
