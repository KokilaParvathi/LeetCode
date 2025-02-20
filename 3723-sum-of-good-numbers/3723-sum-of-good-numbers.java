class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isGood = true;

            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                isGood = false;
            }
            if (i + k < n && nums[i] <= nums[i + k]) {
                isGood = false;
            }

            if (isGood) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
