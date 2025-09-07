class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length, res[] = new int[n - k + 1], cnt[] = new int[101];
        for (int i = 0; i < k; i++)
            cnt[nums[i] + 50]++;
        for (int i = 0; i <= n - k; i++) {
            int c = 0, val = 0;
            for (int j = 0; j < 50; j++) {
                c += cnt[j];
                if (c >= x) {
                    val = j - 50;
                    break;
                }
            }
            res[i] = val;
            if (i + k < n) {
                cnt[nums[i] + 50]--;
                cnt[nums[i + k] + 50]++;
            }
        }
        return res;
    }
}
