class Solution {
    public int findPeakElement(int[] nums) {
    if(nums.length == 1) return 0;

    for(int itr = 2; itr < nums.length; itr++){
        if(nums[itr-2] < nums[itr-1] && nums[itr-1] > nums[itr]) return itr-1;
    }
    
    return nums[0]>nums[1]?0:nums.length-1; 
    }
}