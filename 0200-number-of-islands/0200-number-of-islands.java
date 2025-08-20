class Solution {
    public int numIslands(char[][] grid) {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == '1'){
                    ch(grid,i,j,m,n);
                    island++;
                }
            }
        }
        
        return island;
    }
    void ch(char[][] grid,int i,int j,int m,int n){
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') return;
        grid[i][j] = '*';
       ch(grid,i+1,j,m,n);
       ch(grid,i-1,j,m,n);
       ch(grid,i,j+1,m,n);
       ch(grid,i,j-1,m,n);
        
    }
}