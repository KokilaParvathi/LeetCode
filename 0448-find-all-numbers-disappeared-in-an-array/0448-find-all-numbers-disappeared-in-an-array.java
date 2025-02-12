class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();

    for(int num: nums){
        hs.add(num);
    }
    
    int i =1;
    for(int num: nums){
    if(!hs.contains(i)) ans.add(i);
    i++;
    }

    return ans;
    }
}