class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 0) return 0;

        int prev = 0,prev1 =0;

        for(int num:nums){
            int temp = prev1;
            prev1 = Math.max(prev1,prev+num);
            prev = temp;
        }

        return prev1;
    }
}