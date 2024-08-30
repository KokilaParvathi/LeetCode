class Solution {
    public int maximumCount(int[] nums) {
        int left = 0, n = 0, p = 0;
        int right = nums.length - 1;

        while (right >= left) {
            int mid = (right + left) / 2;

            if (nums[mid] < 0) {
                n = mid + 1;
                left = mid + 1;
            } else if (nums[mid] > 0) {
                p = nums.length - mid;
                right = mid - 1;
            } else {
                if (mid > 0 && nums[mid - 1] < 0) {
                    n = mid;
                }
                if (mid < nums.length - 1 && nums[mid + 1] > 0) {
                    p = nums.length - mid - 1;
                }
                right = mid - 1;
            }
        }

        return Math.max(p, n);
    }
}
