class Solution {
    public void moveZeroes(int[] nums) {
      int[] arr = Arrays.copyOf(nums,nums.length);
      Arrays.fill(nums, 0);
      int index=0;
      for(int itr=0;itr<nums.length;itr++){
        if(arr[itr]!=0)
        nums[index++]=arr[itr];
      }  
    }
}