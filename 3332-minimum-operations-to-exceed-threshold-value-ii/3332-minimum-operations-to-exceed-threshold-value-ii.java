class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count = 0;

        for (long num : nums) {
            pq.add(num);
        }

        while (pq.size() > 1 && pq.peek() < k) {
            long x = pq.poll();
            long y = pq.poll();
            pq.add(x * 2 + y);
            count++;
        }

        return count;
    }
}
