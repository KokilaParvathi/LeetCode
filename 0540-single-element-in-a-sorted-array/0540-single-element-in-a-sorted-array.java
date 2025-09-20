class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0, l = nums.length - 1;

        while (s < l) {
            int mid = (s + l) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] == nums[mid + 1]) s = mid + 2;
            else l = mid;
        }
        return nums[s];
    }
}