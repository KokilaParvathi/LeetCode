class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,m,n);
                     islands++;
                } 
            }
        }  
        return islands;
    }
    
    public void dfs(char[][] grid, int i, int j, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] != '1') return;
        grid[i][j]='$';

        dfs(grid,i+1,j,m,n); //up
        dfs(grid,i-1,j,m,n); //down
        dfs(grid,i,j-1,m,n); //left
        dfs(grid,i,j+1,m,n); //right
    }
}
