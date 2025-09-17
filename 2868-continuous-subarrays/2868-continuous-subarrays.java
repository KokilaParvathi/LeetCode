import java.util.*;

class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length, l = 0;
        long res = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int r = 0; r < n; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.lastKey() - map.firstKey() > 2) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}
