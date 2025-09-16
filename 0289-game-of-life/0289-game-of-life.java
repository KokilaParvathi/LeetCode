class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] update = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = neigh(board, i, j, m, n);
                if (board[i][j] == 1) {
                    if (count < 2 || count > 3)
                        update[i][j] = 0;
                    else
                        update[i][j] = 1;
                } else if (board[i][j] == 0 && count == 3)
                    update[i][j] = 1;
            }
        }

        for (int i = 0; i < update.length; i++) {
            for (int j = 0; j < update[i].length; j++) {
                board[i][j] = update[i][j];
            }
        }

    }

    public int neigh(int[][] board, int s, int e, int m, int n) {
        int[][] dirs = {
                { -1, -1 }, { -1, 0 },
                { -1, 1 }, { 0, -1 },
                { 0, 1 }, { 1, -1 },
                { 1, 0 }, { 1, 1 }
        };
        int count = 0;

        for (int i = 0; i < dirs.length; i++) {
            int ni = s + dirs[i][0];
            int nj = e + dirs[i][1];
            if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                if (board[ni][nj] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
