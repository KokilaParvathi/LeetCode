class Solution {
    public boolean search(int[] nums, int target) {
       int slow = 0,fast=nums.length-1;

       while(slow<=fast){
        if(nums[slow]==target) return true;
        if(nums[fast]==target) return true;
        slow++;
        fast--;
       }
       return false; 
    }
}