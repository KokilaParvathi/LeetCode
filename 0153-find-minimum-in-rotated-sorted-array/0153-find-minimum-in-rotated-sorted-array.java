class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums[left]<=nums[right]) return nums[left];
        if(nums.length==1) return nums[0];
        while(right>=left){
            int mid=(right+left)/2;
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            if(nums[mid]<nums[mid-1]) return nums[mid];
            else if(nums[mid]<nums[right]) 
            right=mid-1;
            else
            left=mid+1;
        }
        return -1;
    }
}