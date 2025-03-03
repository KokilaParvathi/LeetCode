class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> negative = new LinkedList<>();
        Queue<Integer> positive = new LinkedList<>();

        for(int num:nums){
            if(num < 0) negative.add(num);
            else positive.add(num);
        }

        for(int itr = 0; itr < nums.length; itr++){
            if( itr % 2 == 0){
                if(!positive.isEmpty()){
                    nums[itr] = positive.poll(); 
                }
                else
                nums[itr] = negative.poll();

            }
            else{
                if(!negative.isEmpty()){
                    nums[itr] = negative.poll(); 
                }
                else
                nums[itr] = positive.poll();
            }
        }

        return nums;  
    }
}