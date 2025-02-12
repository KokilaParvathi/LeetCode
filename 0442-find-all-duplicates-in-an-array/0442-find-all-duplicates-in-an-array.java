class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> ans = new ArrayList<>();

    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)>1) ans.add(num);
    } 

    return ans;  
    }
}