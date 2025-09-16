class Solution {
    public int maxTotalFruits(int[][] f, int s, int k) {
        int l = 0, sum = 0, ans = 0;

        for (int r = 0; r < f.length; r++) {
            sum += f[r][1];
            while (l <= r && d(f[l][0], f[r][0], s) > k) {
                sum -= f[l][1];
                l++;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    private int d(int l, int r, int s) {
        int left = Math.abs(s - l) + (r - l);
        int right = Math.abs(s - r) + (r - l);
        return Math.min(left, right);
    }
}
