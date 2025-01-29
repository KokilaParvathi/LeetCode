class Solution {
    public void moveZeroes(int[] nums) {
      Queue<Integer> q = new LinkedList<>();
      int index = 0;
      for(int itr=0;itr<nums.length;itr++){
        if(nums[itr]!=0) q.add(nums[itr]);
      }
      Arrays.fill(nums,0);
      while(!q.isEmpty()){
        nums[index++]=q.poll();
      }
    }
}