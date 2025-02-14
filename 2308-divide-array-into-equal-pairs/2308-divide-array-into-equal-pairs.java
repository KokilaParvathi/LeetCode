class Solution {
    public boolean divideArray(int[] nums) {
    Arrays.sort(nums);
    int paircount = 0;

    for(int i = 1; i < nums.length ;i=i+2){
        if(nums[i-1] == nums[i]) paircount++;
        else return false;
    }   

    return true;
    }
}