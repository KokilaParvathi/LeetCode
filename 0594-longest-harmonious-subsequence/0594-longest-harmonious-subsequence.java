class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0, curr = 0;

        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > 1) {
                left++;
            }
            if (nums[right] - nums[left] == 1) {
                curr = Math.max(curr, right - left + 1);
            }
        }

        return curr;
    }
}
