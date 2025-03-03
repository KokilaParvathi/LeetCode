import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder()); 
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) even.add(nums[i]); 
            else odd.add(nums[i]);  
        }

        int index = 0;
        while (!even.isEmpty()) {
            nums[index] = even.poll();
            index += 2;
        }

        int index1 = 1;
        while (!odd.isEmpty()) {
            nums[index1] = odd.poll();
            index1 += 2;
        }

        return nums;
    }
}
