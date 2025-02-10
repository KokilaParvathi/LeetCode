import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
       
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) <= 2) { 
                nums[i] = num; 
                i++;
            }
        }
        return i;
    }
}
