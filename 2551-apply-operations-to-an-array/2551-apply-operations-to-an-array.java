class Solution {
    private void movezero(int[] nums){
        Queue<Integer> q = new LinkedList<>();
        int i = 0;

        for(int num:nums){
            if(num!=0) q.add(num);
        }
        Arrays.fill(nums,0);
        while(!q.isEmpty()){
            nums[i++]=q.poll();
        }
    }

    public int[] applyOperations(int[] nums) {
    for(int i = 1; i < nums.length; i++){
        if(nums[i]==nums[i-1]){
         nums[i-1] = nums[i-1]*2;
         nums[i] = 0;   
        }
    }
    movezero(nums);
    return nums;
    }
}