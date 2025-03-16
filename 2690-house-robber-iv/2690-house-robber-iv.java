class Solution {
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num < l) l = num;
            if(num > r) r = num;
        }
        int res = 0;
        while(l <= r) {
            int mid = (l + r) / 2;
            int include = 0;
            for(int i = 0; i < n; i++) {
                if(nums[i] <= mid) {
                    include++;
                    i++; // skip the next one
                }
            }
            if(include >= k) {
                r = mid - 1;
                res = mid;
            }
            else
                l = mid + 1;
        }
        return res;
    }
}