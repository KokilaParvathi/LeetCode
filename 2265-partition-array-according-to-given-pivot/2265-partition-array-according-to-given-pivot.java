class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> res = new LinkedList<>();

        for(int num:nums) if(num < pivot) res.add(num);
        for(int num:nums) if(num == pivot) res.add(num);
        for(int num:nums) if(num > pivot) res.add(num);
        
        int i = 0;
        while(!res.isEmpty()){
            nums[i] = res.poll();
            i++;
        }

     return nums;   
    }
}