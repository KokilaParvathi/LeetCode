class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> res = new ArrayList<>();
    HashMap<Integer , Integer> map = new HashMap<>();
    int n = nums.length/3;

    for(int num: nums){
        map.put(num, map.getOrDefault(num , 0) + 1);
    }

     for (int key : map.keySet()) {
            if (map.get(key) > n) res.add(key);
     }

    return res; 
    }
}