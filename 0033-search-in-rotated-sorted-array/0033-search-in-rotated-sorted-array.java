class Solution {
    public int search(int[] nums, int target) {
     int slow=0,fast = nums.length-1; 
    
    while(slow<=fast){
        if(nums[slow]==target) return slow;
        if(nums[fast]==target) return fast;
     slow++;
     fast--;
    }
    return -1;
    }
}