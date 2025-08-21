class Solution {
    public int findPeakElement(int[] nums) {
    if(nums.length == 1 || nums[0] > nums[1]) return 0;

    for(int itr = 1; itr < nums.length-1; itr++){
        if(nums[itr-1] < nums[itr] && nums[itr] > nums[itr+1]) return itr;
    }
    
    return nums.length-1; 
    }
}