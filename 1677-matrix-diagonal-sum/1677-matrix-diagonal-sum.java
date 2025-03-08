class Solution {
    public int diagonalSum(int[][] mat) {
    int rows = mat.length,columns = mat[0].length,sum = 0;

    for(int i = 0 ; i < rows ; i++){
            sum+=mat[i][i];
            if(i != rows-i-1) sum+=mat[i][rows-i-1];
    } 

    return sum;   
    }
}