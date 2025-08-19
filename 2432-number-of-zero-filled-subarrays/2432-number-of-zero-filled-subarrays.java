class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long count = 0, curr = 0;

    for(int num: nums){
        curr = (num == 0) ? curr+1 : 0;
        count += curr;
    }   

        return count;
    }
}