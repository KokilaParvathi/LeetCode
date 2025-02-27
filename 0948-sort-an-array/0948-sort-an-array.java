class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int i:nums){
            pq.add(i);
        }
        int[] result = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            result[i] = pq.poll();
        }
        return result;
    }
}