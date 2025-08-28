class Solution {
    public int[][] diagonalSort(int[][] grid) {
        int m = grid.length;      
        int n = grid[0].length;    

        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.putIfAbsent(key, new PriorityQueue<>());
                map.get(key).add(grid[i][j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).poll();
            }
        }

        return grid;
    }
}
