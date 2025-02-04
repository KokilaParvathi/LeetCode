class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int currcount=0,maxcount=0;

      for(int itr=0; itr<nums.length; itr++){
        if(nums[itr]==1) currcount++;
        else{
        maxcount=Math.max(currcount,maxcount);
        currcount=0;
        }
      }
      return maxcount>currcount?maxcount:currcount;  
    }
}