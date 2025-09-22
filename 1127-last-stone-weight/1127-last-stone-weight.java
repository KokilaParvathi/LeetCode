class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : stones) {
            pq.add(num);
        }

        while (pq.size() >= 2) {
            int x = pq.poll();
            int y = pq.poll();
            if (x != y)
                pq.add(x - y);
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}