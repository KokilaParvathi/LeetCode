class Solution {
    public long coloredCells(int n) {
        long res = (long)2 * n *(n - 1);
        return res + 1;
    }
}