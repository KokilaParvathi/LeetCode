class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> rowMins = new HashSet<>();
        HashSet<Integer> colMaxs = new HashSet<>();


        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMins.add(min);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMaxs.add(max);
        }

  
        for (int num : rowMins) {
            if (colMaxs.contains(num)) {
                ans.add(num);
            }
        }

        return ans;
    }
}
