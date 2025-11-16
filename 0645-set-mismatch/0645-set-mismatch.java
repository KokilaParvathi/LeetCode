class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int miss = 1,rep = 1;

        for(int num:nums){
            if(num == miss) 
            miss++;
        }

        for(int i = 1 ; i <= nums.length-1; i++){
            if(nums[i-1] == nums[i]){
                rep = nums[i];
                break;
            }
        }
        
        
        return new int[]{rep,miss};
    }
}