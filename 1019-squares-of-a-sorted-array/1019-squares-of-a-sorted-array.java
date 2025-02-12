class Solution {
    public int[] sortedSquares(int[] nums) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int num: nums){
        pq.add(num*num);
    }     

    for(int itr = 0;itr < nums.length; itr++){
        nums[itr] = pq.poll();
    }

    return nums;
    }
}