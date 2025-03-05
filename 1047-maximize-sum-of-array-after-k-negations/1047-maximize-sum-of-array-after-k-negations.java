class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }

        while(k > 0){
            pq.add(pq.poll()*-1);
            k--;
        }   

        int sum = 0;
        while(!pq.isEmpty()){
            sum+=pq.poll();

        }
        return sum;

    }
}