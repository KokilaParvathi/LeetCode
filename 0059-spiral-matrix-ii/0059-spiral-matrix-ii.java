class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int c=1,j;
        for(int i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
                a[i][j]=c++;
            for(j=i+1;j<n;j++)
                a[j][n-1]=c++;
            for(j=n-2;j>=i;j--)
                a[n-1][j]=c++;
            for(j=n-2;j>i;j--)
                a[j][i]=c++;
            n--;
        }
        return a;
    }
}