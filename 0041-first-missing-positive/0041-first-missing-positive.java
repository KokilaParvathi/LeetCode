class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0) return 1;
        Arrays.sort(nums);
        int smallpositive=1;
        for(int n:nums){
            if(n==smallpositive) smallpositive++;
            }
        return smallpositive;
    }
}