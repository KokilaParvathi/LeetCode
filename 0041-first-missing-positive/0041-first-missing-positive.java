class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallpositive=1;
        for(int index=0;index<nums.length;index++ ){
            if(nums[index]==smallpositive) smallpositive++;
            }
        return smallpositive;
    }
}