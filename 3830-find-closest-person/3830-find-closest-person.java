class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        if (a < b)
            return 1;
        else
            return a > b ? 2 : 0;
    }
}