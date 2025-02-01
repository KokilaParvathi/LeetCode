class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallpositive=1;
        for(int n:nums){
            if(n==smallpositive) smallpositive++;
            }
        return smallpositive;
    }
}