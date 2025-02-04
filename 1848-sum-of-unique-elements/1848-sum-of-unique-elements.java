class Solution {
    public int sumOfUnique(int[] nums) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    int ans=0;
    
    for(int num:nums){
        hm.put(num,hm.getOrDefault(num,0)+1);
    }

    for(int key:hm.keySet()){
        int val = hm.get(key);
        ans+=val<2?key:0;
    }
    return ans;
    }
}