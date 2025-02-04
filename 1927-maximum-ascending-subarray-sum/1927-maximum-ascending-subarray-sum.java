class Solution {
    public int maxAscendingSum(int[] nums) {
        int prev=0,max=nums[0],curr=0;
        for(int num:nums){
            if(num>prev){
                curr+=num;
            }
            else{
                max=Math.max(max,curr);
                curr=num;
            }
            prev=num;
        }
        return max>curr?max:curr;
    }
}