class Solution {
    public int minMoves(int[] a, int k) {
        int n = a.length;
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) if (a[i] == 1) lst.add(i);
        int m = lst.size();
        if (k <= 1 || m < k) return 0;

        long[] b = new long[m];
        for (int i = 0; i < m; i++) b[i] = (long)lst.get(i) - i;

        long[] pref = new long[m + 1];
        for (int i = 0; i < m; i++) pref[i + 1] = pref[i] + b[i];

        long ans = Long.MAX_VALUE;
        for (int l = 0; l <= m - k; l++) {
            int r = l + k - 1;
            int mid = l + k / 2;
            long leftCnt = mid - l;
            long rightCnt = r - mid;
            long leftSum = b[mid] * leftCnt - (pref[mid] - pref[l]);
            long rightSum = (pref[r + 1] - pref[mid + 1]) - b[mid] * rightCnt;
            long total = leftSum + rightSum;
            if (total < ans) ans = total;
        }
        return (int) ans;
    }
}
