class Solution {
    public int maxSubArray(int[] nums) {
        int CurrSum = 0,FinalSum = Integer.MIN_VALUE;

        for(int num:nums){
            CurrSum += num;
            FinalSum = Math.max(FinalSum,CurrSum);
            if(CurrSum < 0) CurrSum = 0;
        }

        return FinalSum;
    }
}