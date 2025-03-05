import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int disorderIndex = -1;

   
        for (int i = 0; i < n; i++) {
            if (nums.get(i) > nums.get((i + 1) % n)) { 
                if (disorderIndex != -1) { 
                    return -1; 
                }
                disorderIndex = i;
            }
        }
        return disorderIndex == -1 ? 0 : n - disorderIndex - 1;
    }
}
