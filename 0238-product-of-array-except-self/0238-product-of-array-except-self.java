class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int zeroCount = 0;

 
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                nums[i] = 0;
            } else if (zeroCount == 1) {
                nums[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                nums[i] = totalProduct / nums[i];
            }
        }

        return nums;
    }
}
