class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (!rowSet.add(matrix[i][j])) return false;
                if (!colSet.add(matrix[j][i])) return false;
            }
        }

        return true;
    }
}