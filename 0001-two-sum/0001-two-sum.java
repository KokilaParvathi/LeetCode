class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=0;
        l1:
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target)
                break l1;
            }   
        }
        return new int[]{i,j};
    }
    
}