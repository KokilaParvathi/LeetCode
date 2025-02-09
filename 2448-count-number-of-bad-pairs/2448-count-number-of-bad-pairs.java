class Solution {
    public long countBadPairs(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    long count = 0,n = nums.length, totalPairs = (n * (n - 1)) / 2, goodPairs = 0;

    for(int i = 0; i < nums.length; i++){
        int cur = nums[i] - i; 
        goodPairs += map.getOrDefault(cur, 0); 
        map.put(cur, map.getOrDefault(cur, 0) + 1); 
    }
    return totalPairs - goodPairs;    
    }
}