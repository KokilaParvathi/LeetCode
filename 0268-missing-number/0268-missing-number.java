class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,actualsum=0;
        int exceptsum = (n*(n+1))/2;

        for(int num:nums){
            actualsum += num;
        }   

        return exceptsum - actualsum;
    }
}