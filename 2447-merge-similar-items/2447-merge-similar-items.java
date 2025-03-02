class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : items1) {  
            if (!map.containsKey(arr[0])) pq.add(arr[0]);
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        for (int[] arr : items2) {  
            if (!map.containsKey(arr[0])) pq.add(arr[0]);
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        while (!pq.isEmpty()) {
            int key = pq.poll();
            res.add(Arrays.asList(key, map.get(key)));  

        }
        return res;
    }
}
