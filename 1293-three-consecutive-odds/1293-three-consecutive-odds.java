class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {

    for(int itr = 2; itr < nums.length ; itr++){
     if((nums[itr-2]%2 != 0) && (nums[itr-1]%2 != 0) && (nums[itr]%2 != 0))
     return true;
    }    

    return false;
    }
}