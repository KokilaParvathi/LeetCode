class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int zeroCount = 0;

        // First pass: Calculate total product (excluding zeros) and count zeros
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        // Second pass: Build the result
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                nums[i] = 0; // More than one zero, all products will be zero
            } else if (zeroCount == 1) {
                nums[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                nums[i] = totalProduct / nums[i];
            }
        }

        return nums;
    }
}
