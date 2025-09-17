class Solution {
    public int findUnsortedSubarray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;

        for (int num : nums) {
            pq.add(num);
        }

        int flag = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != pq.poll()) {
                arr.add(i);
                k++;
            }
        }

        if (k == 0)
            return 0;
        return arr.get(k - 1) - arr.get(0) + 1;
    }
}