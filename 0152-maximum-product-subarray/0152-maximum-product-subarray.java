class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1, suf = 1, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            pre = pre == 0 ? 1 : pre;
            suf = suf == 0 ? 1 : suf;

            pre *= nums[i];
            suf *= nums[nums.length - i - 1];

            max = Math.max(max, Math.max(suf, pre));
        }

        return max;
    }
}