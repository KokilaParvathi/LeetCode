class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num = 0;

        for(int n:nums){
            num^=n;
        }

        return num;
    }
}