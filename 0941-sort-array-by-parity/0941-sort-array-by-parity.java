class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Queue<Integer> arr = new LinkedList<>();   

        for(int num:nums){
          if(num % 2 == 0) arr.add(num);  
        } 

        for(int num:nums){
          if(num % 2 != 0) arr.add(num);  
        } 

        int i = 0;
        while(!arr.isEmpty()){
            nums[i++] = arr.poll();
        }

        return nums;
    }
}