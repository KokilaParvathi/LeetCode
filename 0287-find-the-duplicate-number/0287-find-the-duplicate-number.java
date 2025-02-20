class Solution {
    public int findDuplicate(int[] nums) {
    HashMap<Integer,Integer> hm = new HashMap<>();

    for(int num:nums){
        hm.put(num,hm.getOrDefault(num,0)+1);

        if (hm.get(num) > 1) 
        return num;
    }  

    return -1; 
    }
}