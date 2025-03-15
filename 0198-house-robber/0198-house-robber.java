class Solution {
    public int rob(int[] nums) {
        int prev = 0,prev1 =0;

        for(int num:nums){
            int temp = prev1;
            prev1 = Math.max(prev1,prev+num);
            prev = temp;
        }

        return prev1;
    }
}