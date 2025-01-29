class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int d= k%nums.length;
       if(nums.length==1) return;
       for(int itr = nums.length-d;itr<nums.length;itr++){
        queue.add(nums[itr]);
       }
       for(int itr =0;itr<nums.length-d;itr++){
        queue.add(nums[itr]);
       }
       int itr=0;;
       while(!queue.isEmpty()){
        nums[itr++]=queue.poll();
       }
    }
}