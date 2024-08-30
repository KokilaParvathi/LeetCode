class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            int r = mid / n;
            int c = mid % n;
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
