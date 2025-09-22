class Solution {
    public int findUnsortedSubarray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[2];

        for(int num:nums){
            pq.add(num);
        }

        int flag=0;

        for(int i = 0;i< nums.length;i++){
            if(nums[i] != pq.poll()){
                if(flag == 0){
                 arr[0] = i; 
                 flag = 1;}  
                else
                arr[1] = i; 
            }
        }

        return (arr[1]-arr[0]) == 0?0 :arr[1]-arr[0]+1;
    }
}