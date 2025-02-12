class Solution {
    public int ans(int[] nums){
    int sum = 0,element = 0;
        for(int num:nums){
           element+=num;
           int temp = num; 
            while(temp > 0){
                sum+=temp%10;
                temp/=10;
            }
        }
    return Math.abs(sum - element);
    }

    public int differenceOfSum(int[] nums) {
    return ans(nums);  
    }
}