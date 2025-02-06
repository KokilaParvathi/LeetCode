class Solution {

    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                mp.put(nums[i]*nums[j], mp.getOrDefault(nums[i]*nums[j],0)+2);
            }
        }
        
        int res = 0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            res+=e.getValue() * (e.getValue()-2);
        }
        return res;
    }
}