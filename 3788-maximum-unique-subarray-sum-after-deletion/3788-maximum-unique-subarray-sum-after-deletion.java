class Solution {
    public int maxSum(int[] nums) {
        int sum = 0, mx = -1000;
    Set<Integer> s = new HashSet<>();
    for(int i = 0; i < nums.length; i++){
        mx = Math.max(mx, nums[i]);
        if(nums[i] <= 0 || s.contains(nums[i])) continue;
        sum += nums[i];
        s.add(nums[i]);
    }
    return (mx <= 0)?mx:sum;
    }
}