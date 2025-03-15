import java.util.Arrays;

class Solution {
    
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int case1 = robHelper(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int case2 = robHelper(Arrays.copyOfRange(nums, 1, nums.length));

        return Math.max(case1, case2);
    }

    private int robHelper(int[] nums) {
        int prev = 0, prev1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = prev;
            prev = Math.max(prev, prev1 + nums[i]);
            prev1 = temp;
        }
        return prev;
    }
}
