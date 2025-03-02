class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : nums1) { 
            if (!map.containsKey(arr[0])) pq.add(arr[0]); 
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        for (int[] arr : nums2) {  
            if (!map.containsKey(arr[0])) pq.add(arr[0]);
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        int[][] res = new int[pq.size()][2];
        int i = 0;
        while (!pq.isEmpty()) {
            int key = pq.poll();
            res[i++] = new int[]{key, map.get(key)};
        }

        return res;
    }
}
