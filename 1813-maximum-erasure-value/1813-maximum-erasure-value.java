import java.util.*;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int start = 0, sum = 0, max = 0;

        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            sum += nums[end];
            max = Math.max(max, sum);
        }

        return max;
    }
}
