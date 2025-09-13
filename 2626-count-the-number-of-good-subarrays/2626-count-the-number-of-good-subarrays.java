class Solution {
    public long countGood(int[] a, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        long ans = 0;
        int l = 0;

        for (int r = 0; r < a.length; r++) {
            k -= mp.getOrDefault(a[r], 0);
            mp.put(a[r], mp.getOrDefault(a[r], 0) + 1);

            while (k <= 0) {
                mp.put(a[l], mp.get(a[l]) - 1);
                k += mp.get(a[l]);
                l++;
            }
            ans += l;
        }
        return ans;
    }
}
