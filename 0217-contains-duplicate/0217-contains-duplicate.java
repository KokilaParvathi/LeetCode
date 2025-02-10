class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int num: nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)>1) return true;
    }
    return false;  
    }
}